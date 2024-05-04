package principe;


//Classe Utilisateur
class Utilisateur {
 public void afficherDetails() {
     System.out.println("Je suis un utilisateur.");
 }
}

//Classe pour les administrateurs
class Administrateur extends Utilisateur {
 @Override
 public void afficherDetails() {
     System.out.println("Je suis un administrateur details.");
 }
}

//Classe pour les clients de lavage
class ClientLavage extends Utilisateur {
 @Override
 public void afficherDetails() {
     System.out.println("Je suis un client de lavage.");
 }
}

//Méthode utilisant des objets Utilisateur
class GestionUtilisateurs {
 public void afficherDetailsUtilisateur(Utilisateur utilisateur) {
     utilisateur.afficherDetails();
 }
}

//Utilisation du principe de substitution de Liskov
public class maintest {
 public static void main(String[] args) {
     Utilisateur admin = new Administrateur();
     Utilisateur client = new ClientLavage();

     GestionUtilisateurs gestionUtilisateurs = new GestionUtilisateurs();
     gestionUtilisateurs.afficherDetailsUtilisateur(admin);
     gestionUtilisateurs.afficherDetailsUtilisateur(client);
 }
}
