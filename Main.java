//Interface pour les utilisateurs
interface Utilisateur {
 void afficherDetails();
}
//Classe pour les administrateurs
class Administrateur implements Utilisateur {
 @Override
 public void afficherDetails() {
     System.out.println("Je suis un administrateur.");
 }
}
//Classe pour les clients de lavage
class ClientLavage implements Utilisateur {
 @Override
 public void afficherDetails() {
     System.out.println("Je suis un client de lavage.");
 }
}
//Fabrique abstraite pour créer des utilisateurs
interface CreatUtilisateur {
 Utilisateur CreateUser();
}
//Fabrique concrète pour créer des administrateurs
class CreatAdministrateur implements CreatUtilisateur {
 @Override
 public Utilisateur CreateUser() {
     return new Administrateur();
 }
}
//Fabrique concrète pour créer des clients de lavage
class CreatClientLavage implements CreatUtilisateur {
 @Override
 public Utilisateur CreateUser() {
     return new ClientLavage();
 }
}
//Utilisation des fabriques pour créer des instances d'utilisateurs
public class Main {
 public static void main(String[] args) {
	 CreatUtilisateur fabriqueAdmin = new CreatAdministrateur();
     Utilisateur admin = fabriqueAdmin.CreateUser();
     admin.afficherDetails();

     CreatUtilisateur fabriqueClient = new CreatClientLavage();
     Utilisateur client = fabriqueClient.CreateUser();
     client.afficherDetails();
 }
}
