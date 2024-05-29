package solid;

public class StationLavage {

	  private int _id;
	    private String nomStation;
	    private String adresse;
	    private String ville;
	    private String email;
	    private String password;
	    private double longitude;
	    private double latitude;
	    private String avatar;
	    private String jourPT;
	    private String statut;

	    // Constructeur
	    public StationLavage(int _id, String nomStation, String adresse, String ville, String email, String password,
	                         double longitude, double latitude, String avatar, String jourPT, String statut) {
	        this._id = _id;
	        this.nomStation = nomStation;
	        this.adresse = adresse;
	        this.ville = ville;
	        this.email = email;
	        this.password = password;
	        this.longitude = longitude;
	        this.latitude = latitude;
	        this.avatar = avatar;
	        this.jourPT = jourPT;
	        this.statut = statut;
	    }

    // Getters et setters
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getJourPT() {
        return jourPT;
    }

    public void setJourPT(String jourPT) {
        this.jourPT = jourPT;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "StationDeLavage{" +
                "_id=" + _id +
                ", nomStation='" + nomStation + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", avatar='" + avatar + '\'' +
                ", jourPT='" + jourPT + '\'' +
                '}';
    }
}

