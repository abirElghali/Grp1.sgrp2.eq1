import java.time.LocalDateTime;

public interface Reservationg {
    void ajouterReservation(Reservation reservation);

    void afficherReservation();

    void modifierReservation(Reservation reservation);

    void supprimerReservation(Reservation reservation);

    LocalDateTime getDateHeure();

    void setDateHeure(LocalDateTime dateHeure);

    String getEtat();

    void setEtat(String etat);

    String getNature();

    void setNature(String nature);
}

public class ReservationImpl implements Reservation {
    private LocalDateTime dateHeure;
    private String etat;
    private String nature;

    @Override
    public void ajouterReservation(Reservation reservation) {
        // Logique d'ajout de réservation
    }

    @Override
    public void afficherReservation() {
        System.out.println("Date et heure : " + dateHeure);
        System.out.println("État : " + etat);
        System.out.println("Nature : " + nature);
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
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    @Override
    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    @Override
    public String getEtat() {
        return etat;
    }

    @Override
    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String getNature() {
        return nature;
    }

    @Override
    public void setNature(String nature) {
        this.nature = nature;
    }
}

public class ReservationProxy implements Reservation {
    private Reservation realReservation;

    public ReservationProxy(Reservation realReservation) {
        this.realReservation = realReservation;
    }

    @Override
    public void ajouterReservation(Reservation reservation) {
        // Logique supplémentaire si nécessaire
        realReservation.ajouterReservation(reservation);
    }

    @Override
    public void afficherReservation() {
        // Logique supplémentaire si nécessaire
        realReservation.afficherReservation();
    }

    @Override
    public void modifierReservation(Reservation reservation) {
        // Logique supplémentaire si nécessaire
        realReservation.modifierReservation(reservation);
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        // Logique supplémentaire si nécessaire
        realReservation.supprimerReservation(reservation);
    }

    @Override
    public LocalDateTime getDateHeure() {
        // Logique supplémentaire si nécessaire
        return realReservation.getDateHeure();
    }

    @Override
    public void setDateHeure(LocalDateTime dateHeure) {
        // Logique supplémentaire si nécessaire
        realReservation.setDateHeure(dateHeure);
    }

    @Override
    public String getEtat() {
        // Logique supplémentaire si nécessaire
        return realReservation.getEtat();
    }

    @Override
    public void setEtat(String etat) {
        // Logique supplémentaire si nécessaire
        realReservation.setEtat(etat);
    }

    @Override
    public String getNature() {
        // Logique supplémentaire si nécessaire
        return realReservation.getNature();
    }

    @Override
    public void setNature(String nature) {
        // Logique supplémentaire si nécessaire
        realReservation.setNature(nature);
    }
}
