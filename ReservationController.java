import java.time.LocalDateTime;
import java.util.List;

// Interface Reservation
interface Reservation {
    void afficherReservation();

    void setDateHeure(LocalDateTime dateHeure);

    void setEtat(String etat);

    void setNature(String nature);
}

// Implémentation de l'interface Reservation
class ReservationImpl implements Reservation {
    private LocalDateTime dateHeure;
    private String etat;
    private String nature;

    @Override
    public void afficherReservation() {
        System.out.println("Date et heure : " + dateHeure);
        System.out.println("État : " + etat);
        System.out.println("Nature : " + nature);
    }

    @Override
    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    @Override
    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public void setNature(String nature) {
        this.nature = nature;
    }
}

// Interface ReservationService
interface ReservationService {
    void ajouterReservation(Reservation reservation);

    void modifierReservation(Reservation reservation);

    void supprimerReservation(Reservation reservation);

    List<Reservation> getAllReservations();
}

// Implémentation de l'interface ReservationService
class ReservationServiceImpl implements ReservationService {
    // Implémentez les méthodes d'ajout, de modification, de suppression et de
    // récupération des réservations
    // ...

    @Override
    public void ajouterReservation(Reservation reservation) {
        // Logique d'ajout de réservation
    }

    @Override
    public void modifierReservation(Reservation reservation) {
        // Logique de modification de réservation
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        // Logique de suppression de réservation
    }

    @Override
    public List<Reservation> getAllReservations() {
        // Logique de récupération de toutes les réservations
        return null; // Retourne une liste vide pour l'exemple
    }
}

// Classe ReservationController
public class ReservationController {
    private ReservationService reservationService;

    // Constructeur prenant en paramètre le service de réservation
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // Méthode pour ajouter une réservation
    public void ajouterReservation(Reservation reservation) {
        reservationService.ajouterReservation(reservation);
    }

    // Méthode pour modifier une réservation
    public void modifierReservation(Reservation reservation) {
        reservationService.modifierReservation(reservation);
    }

    // Méthode pour supprimer une réservation
    public void supprimerReservation(Reservation reservation) {
        reservationService.supprimerReservation(reservation);
    }

    // Méthode pour récupérer toutes les réservations
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    // Méthode main pour tester le contrôleur de réservation
    public static void main(String[] args) {
        // Création du service de réservation
        ReservationService reservationService = new ReservationServiceImpl();

        // Création du contrôleur de réservation
        ReservationController reservationController = new ReservationController(reservationService);

        // Création d'une réservation
        Reservation reservation = new ReservationImpl();
        reservation.setDateHeure(LocalDateTime.now());
        reservation.setEtat("En attente");
        reservation.setNature("Lavage standard");

        // Ajout de la réservation
        reservationController.ajouterReservation(reservation);

        // Affichage de toutes les réservations
        List<Reservation> reservations = reservationController.getAllReservations();
        for (Reservation r : reservations) {
            System.out.println("Réservation : ");
            r.afficherReservation();
        }
    }
}
