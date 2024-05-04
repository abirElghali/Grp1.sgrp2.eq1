package Proxy;

import java.time.LocalDateTime;

public interface Reservation {
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