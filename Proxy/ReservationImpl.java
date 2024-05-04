package Proxy;

import java.time.LocalDateTime;

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
        System.out.println("Réservation : ");
        if (dateHeure != null) {
            System.out.println("Date et heure : " + dateHeure);
        }
        if (etat != null) {
            System.out.println("État : " + etat);
        }
        if (nature != null) {
            System.out.println("Nature : " + nature);
        }
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
