# projet-employe-machine-jsf-ejb
# Système de Gestion des Employés et des Machines

## Description

Ce projet vise à développer une application simple pour attribuer des machines aux employés. L'application sera construite en utilisant JSF, PrimeFaces, Facelets et EJB, avec GlassFish comme serveur d'application.

### Fonctionnalités

1. **Opérations CRUD :**
   - Gérer les employés et les machines avec les opérations de création, lecture, mise à jour et suppression.

2. **Recherche des Machines par Employé :**
   - Rechercher les machines attribuées à un employé spécifique.

3. **Représentation Graphique :**
   - Visualiser un graphique illustrant le nombre de machines achetées chaque année.

4. **Support Multilingue :**
   - Basculer entre les langues anglaise et française.

## Technologies Utilisées

- Java
- PrimeFaces
- Hibernate
- MySQL
- JSF
- GlassFish

## Instructions d'Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/ghita-baghdad/projet-employe-machine-jsf-ejb.git
   cd votre-dépôt

2. Créez des comptes utilisateur qui peuvent accéder à l'application dans MySQL dans l'entité user.

3. Lancez le projet dans GlassFish Server
   
## Configuration

Avant de modifier persistence.xml et glassfish-resources.xml, assurez-vous que le pool JDBC et les ressources JDBC sont configurés dans GlassFish.

## Configuration du Pool JDBC (exemple) :

- Nom du Pool : VotreNomDePool
- Type de Ressource : java.sql.Driver
- Classe du Pilote : com.mysql.jdbc.Driver
- Propriétés Additionnelles :
  -user = votre-nom-d-utilisateur-mysql
  -password = votre-mot-de-passe-mysql
  -databaseName = votre-nom-de-base-de-donnees
  -portNumber = votre-port-mysql
  -Url = jdbc:mysql://votre-hôte-mysql:votre-port-mysql/votre-nom-de-base-de-donnees

## Configuration de la Ressource JDBC (exemple) :

-Nom JNDI : jdbc/VotreDataSource
-Nom du Pool : VotreNomDePool

## Captures d'Écran
## Pool de Connexion JDBC :

<img width="731" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/a2237521-b0ae-4896-8ac9-90b07e429930">

### Page de Connexion
<img width="920" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/76eadc01-7f93-4fde-96b4-cea92c99761b">

### Échec de Connexion
<img width="915" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/097404a7-0f70-43df-806a-333033024517">

### employe
<img width="926" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/a8d28cfa-a2a5-40ed-bff0-ccb43a43beef">

### machine
<img width="925" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/f5799367-4542-4397-a5f0-4f9271bd9a35">

### machine par employe
<img width="925" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/dc55c8c6-0c47-4ffc-a043-1169626803bb">

### Graphe : Nombre de machines par an
<img width="960" alt="image" src="https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/fa8547c3-7e31-4c39-beac-8919a6654300">

### Traduction

https://github.com/MaskedFezz/project-employee-machine-jsf-ejb/assets/130797834/668e0ac6-f7d6-4005-ac03-2887d423a80f

## Auteurs 
- Ghita Baghdad ([ghita-baghdad](https://github.com/ghita-baghdad))
- Mohamed Fezzazi ([MaskedFezz](https://github.com/MaskedFezz))
- Yassine Ghazi ([Ghaziyassine](https://github.com/Ghaziyassine))



   
