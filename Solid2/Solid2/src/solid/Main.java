package solid;
import java.util.List;
public class Main {
    public static void main(String[] args) {
     
            // Création de quelques clients
            ClientLavage client1 = new ClientLavage("John", "Doe", "123456789", "john@example.com", "123 Main St", "password123");
            ClientLavage client2 = new ClientLavage("Alice", "Smith", "987654321", "alice@example.com", "456 Oak St", "password456");

            // Création de quelques stations de lavage
            StationLavage station1 = new StationLavage(1, "Station 1", "789 Elm St", "City 1", "station1@example.com", "stationpass1", 0.0, 0.0,
            		"", "Mon-Fri", "Open");
            StationLavage station2 = new StationLavage(2, "Station 2", "321 Pine St", "City 2", "station2@example.com", "stationpass2", 0.0, 0.0,
            		"", "Mon-Sat", "Closed");
            // Création des services de gestion des clients et des stations
            RegistrationService2<ClientLavage> clientService = new RegistrationService2<>();
            RegistrationService2<StationLavage> stationService = new RegistrationService2<>();
            
            // Enregistrement des clients
            clientService.inscrire(client1);
            clientService.inscrire(client2);
           // Enregistrement des stations
            stationService.inscrire(station1);
            stationService.inscrire(station2);

            // Récupération de tous les clients enregistrés
            List<ClientLavage> allClients = clientService.consulterListe();
            System.out.println("All Clients:");
            for (ClientLavage client : allClients) {
                System.out.println(client);
            }
            // Récupération de toutes les stations enregistrées
            List<StationLavage> allStations = stationService.consulterListe();
            System.out.println("\nAll Stations:");
            for (StationLavage station : allStations) {
                System.out.println(station);
            }    }
}