package SOLID;

import java.util.Scanner;

public class Demo {
    

	public static void main(String[] args) {
		  Administrateur administrateur = new Administrateur();
		    Scanner scanner = new Scanner(System.in);

		    // Abonnement à l'événement de changement de statut
		    System.out.print("Entrez l'identifiant de la station : ");
		    String stationId = scanner.nextLine();

		    System.out.print("Entrez l'email de la station : ");
		    String stationEmail = scanner.nextLine();

		    System.out.print("Entrez le nouveau statut : ");
		    String nouveauStatut = scanner.nextLine();

		    administrateur.events.enregistrerAbonnement("changement_statut", 
		    		new EmailNotificationListener(stationEmail));
		    administrateur.events.enregistrerAbonnement("changement_statut", 
		    		new LogStatutListener("C:\\Gl\\Notife.txt"));

		 
		    try {
		        administrateur.changerStatut(stationEmail, nouveauStatut); 
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

	    scanner.close();}
}
