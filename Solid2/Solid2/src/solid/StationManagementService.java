package solid;

import java.util.ArrayList;
import java.util.List;

public class StationManagementService {
    // Simulons une base de données pour stocker les stations de lavage
    private List<StationLavage> stationDatabase = new ArrayList<>();

    // Méthode pour récupérer toutes les stations
    public List<StationLavage> Consulter_List_station() {
        return stationDatabase;
    }

    // Méthode pour supprimer une station
    public void supprimer_station_lavage(StationLavage station) {
        stationDatabase.remove(station);
        System.out.println("Station deleted: " + station);
    }

    // Méthode pour modifier les informations d'une station
    public void Modifier_Son_Profile(StationLavage station, String newEmail, String newAddress) {   
        for (StationLavage s : stationDatabase) {
            if (s.get_id() == station.get_id()) {        
                s.setEmail(newEmail);
                s.setAdresse(newAddress);
                System.out.println("Station modified: " + s);
                return;
            }
        }
        System.out.println("Station not found: " + station);
    }

    // Méthode pour modifier les horaires de travail d'une station
    public void Modifier_Horaire_travail(StationLavage station, String newWorkHours) {
        for (StationLavage s : stationDatabase) {
            if (s.get_id() == station.get_id()) {
                s.setJourPT(newWorkHours);
                System.out.println("Work hours modified for station: " + s);
                return;
            }
        }
        System.out.println("Station not found: " + station);
    }
}