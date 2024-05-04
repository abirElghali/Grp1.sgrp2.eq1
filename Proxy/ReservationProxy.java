package Proxy;

import java.time.LocalDateTime;

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