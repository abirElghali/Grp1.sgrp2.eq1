package solid;

import java.util.ArrayList;
import java.util.List;
public class ClientManagementService {private List<ClientLavage> clientDatabase = new ArrayList<>();

// Méthode pour récupérer tous les clients
public List<ClientLavage> Consulter_List_ClientLavage() {
    return clientDatabase;
}

// Méthode pour supprimer un client
public void supprimerClient(ClientLavage client) {
    clientDatabase.remove(client);
    System.out.println("Client deleted: " + client);
}
// Méthode pour modifier les informations d'un client
public void modifierProfil(ClientLavage client, String newEmail, String newAddress) {
    for (ClientLavage c : clientDatabase) {
        if (c.get_id() == client.get_id()) {
            // Modification des informations du client
            c.setEmail(newEmail);
            c.setAdr(newAddress);
            System.out.println("Client profile modified: " + c);
            return;
        }
    }
    System.out.println("Client not found: " + client);
}
}

