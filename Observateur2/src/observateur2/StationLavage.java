package observateur2;

import java.util.ArrayList;

public class StationLavage implements Observable {
    private int _id; // ID généré par l'incrémentation
    private String nomStation; // Nom de la station
    private String adresse; // Adresse de la station
    private String ville; // Ville de la station
    private double longitude; // Longitude de la station
    private String email; // Email de la station
    private String avatar; // Avatar de la station
    private String jourPT; // Jour PT
    private String statut; // Statut de la station

    private ArrayList<Observateur> tabObservateurs; // Tableau d'observateurs

    // Constructeur
    public StationLavage(int id, String nomStation, String adresse, String ville, double longitude, String email, String avatar, String jourPT, String statut) {
        this._id = id;
        this.nomStation = nomStation;
        this.adresse = adresse;
        this.ville = ville;
        this.longitude = longitude;
        this.email = email;
        this.avatar = avatar;
        this.jourPT = jourPT;
        this.statut = statut;
        this.tabObservateurs = new ArrayList<>();
    }

    // Méthode pour ajouter un observateur
    @Override
    public void ajouterObservateur(Observateur o) {
        tabObservateurs.add(o);
    }

    // Méthode pour supprimer un observateur
    @Override
    public void supprimerObservateur(Observateur o) {
        tabObservateurs.remove(o);
    }

    // Méthode pour notifier tous les observateurs
    @Override
    public void notifierObservateur() {
        for (Observateur o : tabObservateurs) {
            o.actualiser(this);
        }
    }

    // Getters et setters pour les attributs
    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
        notifierObservateur();
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
        notifierObservateur();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
        notifierObservateur();
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
        notifierObservateur();
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
        notifierObservateur();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifierObservateur();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifierObservateur();
    }

    public String getJourPT() {
        return jourPT;
    }

    public void setJourPT(String jourPT) {
        this.jourPT = jourPT;
        notifierObservateur();
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
        notifierObservateur();
    }
}
