/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.User;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.primefaces.context.RequestContext;
import services.UserFacade;



/**
 *
 * @author HP
 */@ManagedBean(name = "userController")
@SessionScoped
public class UserController {

    private UserFacade userService;  // Note: Field is declared but not initialized
    private String username;
    private String password;
  @PersistenceContext(unitName = "ctrl2TestPU")
    private EntityManager em;
   private boolean loginFailed;
    // Inject UserFacade using a constructor or a setter method
    public UserController() {
        // You can initialize userService here, or use a setter method.
        // For simplicity, I'll initialize it in the constructor.
        userService = new UserFacade();
    }

    // Getters and setters

public String login() {
        if (isValidCredentials(username, password)) {
            System.out.println("============yes");
            loginFailed = false;
            return "graphe.xhtml";
        } else {
            loginFailed = true;
            RequestContext.getCurrentInstance().execute("PF('loginFailedDialog').show()");
            return null;
        }}
    private boolean isValidCredentials(String username, String password) {
        // Check if userService is null before using it
        System.out.println("================22");
        System.out.println(userService);
        if (userService != null) {
             List<User> users;
        users = em.createQuery("FROM User u WHERE u.username = :username AND u.password = :password", User.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getResultList();
  
        int nbr= users.size();
    

           
            System.out.println(nbr);
            return nbr > 0;
        } else {
            // Handle the case when userService is not initialized
            return false;
        }
    }

    public UserFacade getUserService() {
        return userService;
    }

    public void setUserService(UserFacade userService) {
        this.userService = userService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public boolean isLoginFailed() {
        return loginFailed;
    }

    public void setLoginFailed(boolean loginFailed) {
        this.loginFailed = loginFailed;
    }
    
}
