import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Interface pour la réservation
interface Reservation {
    void afficherReservation();
}

// Classe pour représenter une réservation de lavage de véhicule
class CarWashReservation implements Reservation {
    private LocalDateTime dateTime;
    private String status;
    private String vehicleType;

    public CarWashReservation(LocalDateTime dateTime, String status, String vehicleType) {
        this.dateTime = dateTime;
        this.status = status;
        this.vehicleType = vehicleType;
    }

    @Override
    public void afficherReservation() {
        System.out.println("Date et heure : " + dateTime);
        System.out.println("Statut : " + status);
        System.out.println("Type de véhicule : " + vehicleType);
    }
}

// Interface pour le service de réservation
interface ReservationService {
    void ajouterReservation(Reservation reservation);

    void afficherToutesReservations();
}

// Implémentation du service de réservation
class CarWashReservationService implements ReservationService {
    private List<Reservation> reservations;

    public CarWashReservationService() {
        this.reservations = new ArrayList<>();
    }

    @Override
    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void afficherToutesReservations() {
        for (Reservation reservation : reservations) {
            reservation.afficherReservation();
            System.out.println("------------------------");
        }
    }
}

// Classe principale pour tester le système de réservation de lavage de
// véhicules
public class Solid {
    public static void main(String[] args) {
        // Création du service de réservation
        ReservationService reservationService = new CarWashReservationService();

        // Création de quelques réservations
        Reservation reservation1 = new CarWashReservation(LocalDateTime.of(2024, 4, 28, 10, 0), "En attente",
                "Voiture");
        Reservation reservation2 = new CarWashReservation(LocalDateTime.of(2024, 4, 29, 14, 30), "Confirmée", "Camion");

        // Ajout des réservations au service
        reservationService.ajouterReservation(reservation1);
        reservationService.ajouterReservation(reservation2);

        // Affichage de toutes les réservations
        reservationService.afficherToutesReservations();
    }
}
