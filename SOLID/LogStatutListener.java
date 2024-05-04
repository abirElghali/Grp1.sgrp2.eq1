package SOLID;

import java.io.File;

public class LogStatutListener  implements StatutListener {
    private File log;

    public LogStatutListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String stationEmail, String nouveauStatut) {
        System.out.println("Sauvegarde dans le journal " + log + ": Le statut de la station " + 
    stationEmail + " a été modifié en " + nouveauStatut);
    }
}

