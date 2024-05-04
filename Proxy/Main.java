package Proxy;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Reservation reservationImpl = new ReservationImpl();
        reservationImpl.setDateHeure(LocalDateTime.now());
        reservationImpl.setEtat("En attente");
        reservationImpl.setNature("Lavage standard");

        reservationImpl.afficherReservation();

        System.out.println("-----------------------");

        Reservation reservationProxy = new ReservationProxy(new ReservationImpl());
        reservationProxy.setDateHeure(LocalDateTime.now());
        reservationProxy.setEtat("Confirmé");
        reservationProxy.setNature("Lavage premium");

        reservationProxy.afficherReservation();
    }
}
