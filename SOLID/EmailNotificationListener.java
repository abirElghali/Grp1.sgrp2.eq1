package SOLID;

public class EmailNotificationListener  implements StatutListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String stationEmail, String nouveauStatut) {
        System.out.println("Email à " + stationEmail + " : Le statut de la station " + stationEmail +
        		" a été modifié en " + nouveauStatut);
    }

}

