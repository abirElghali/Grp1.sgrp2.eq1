package SOLID;

import java.io.File;

public class Administrateur {
    private File file;
    public StationLavage events; // Champ pour gérer les abonnements aux événements
    private StationLavage stationLavage; // Gérer la station de lavage

    public Administrateur() {
        this.stationLavage = new StationLavage("changement_statut");
        this.events = stationLavage; // Initialiser l'EventManager avec le StationDeLavageManager
        events.enregistrerAbonnement("open", new LogStatutListener("C:/Gl/Notife.txt"));
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
       
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
        	System.out.println("bien enregistré");

        } else {
            throw new Exception("Veuillez ouvrir un fichier d'abord.");
        }
    }

    public void changerStatut(String idStation, String nouveauStatut) {
        stationLavage.notifierChangementStatut("changement_statut", nouveauStatut, idStation);
    }
}
