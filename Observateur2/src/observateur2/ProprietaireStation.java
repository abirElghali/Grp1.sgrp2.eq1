package observateur2;

public class ProprietaireStation implements Observateur {
    // Méthode appelée automatiquement lors d'un changement d'état de la station de lavage
    @Override
    public void actualiser(Observable o) {
        if (o instanceof StationLavage) {
            StationLavage station = (StationLavage) o;
            MAJ(station);
        }
    }

    // Méthode de mise à jour (MAJ) pour le statut
    public void MAJ(StationLavage station) {
        System.out.println("Mise à jour du statut de la station ");
        System.out.println("Statut : " + station.getStatut());
    }
}
