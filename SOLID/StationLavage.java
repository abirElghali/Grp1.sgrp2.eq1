package SOLID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StationLavage {
    Map<String, List  <StatutListener>> listeners = new HashMap<>();

    public StationLavage(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void enregistrerAbonnement(String eventType, StatutListener listener) {
        List<StatutListener> users = listeners.get(eventType);
        if (users == null) {
            users = new ArrayList<>(); // Initialiser la liste si elle est nulle
            listeners.put(eventType, users); // Ajouter la liste au map
        }
        users.add(listener);
    }

    public void supprimerAbonnement(String eventType, StatutListener listener) {
        List <StatutListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notifierChangementStatut(String eventType, String nouveauStatut, String stationEmail) {
        List  <StatutListener> users = listeners.get(eventType);
        for (StatutListener listener : users) {
            listener.update(stationEmail,nouveauStatut);
        }
    }
}
