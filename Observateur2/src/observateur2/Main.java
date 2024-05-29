package observateur2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Créer une station de lavage
        StationLavage station = new StationLavage(1, "Station A", "123 Rue Example", "Ville A", 45.76, "email@example.com", "avatar.png", "Lundi", "refuser");

        // Créer un propriétaire de station et l'ajouter comme observateur
        ProprietaireStation proprietaire = new ProprietaireStation();
        station.ajouterObservateur(proprietaire);

        // Modifier le statut de la station pour déclencher une mise à jour
        station.setStatut("Accepter");
    }
}
