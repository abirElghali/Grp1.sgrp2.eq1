package solid;

public class ClientLavage {
	  private static int dernierId = 0; // Pour l'incrémentation automatique de l'ID
	    private int _id;
	    private String nom;
	    private String prenom;
	    private String numTel;
	    private String email;
	    private String adr;
	    private String mpass;
	    private String role;

	    // Constructeur
	    public ClientLavage(String nom, String prenom, String numTel, String email, String adr, String mpass) {
	        this._id = ++dernierId;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.numTel = numTel;
	        this.email = email;
	        this.adr = adr;
	        this.mpass = mpass;
	        this.role = "client"; // Par défaut
	    }

	    // Getters et setters
	    public int get_id() {
	        return _id;
	    }

	    public void set_id(int _id) {
	        this._id = _id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public String getNumTel() {
	        return numTel;
	    }

	    public void setNumTel(String numTel) {
	        this.numTel = numTel;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getAdr() {
	        return adr;
	    }

	    public void setAdr(String adr) {
	        this.adr = adr;
	    }

	    public String getMpass() {
	        return mpass;
	    }

	    public void setMpass(String mpass) {
	        this.mpass = mpass;
	    }

	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }

	    @Override
	    public String toString() {
	        return "ClientLavage{" +
	                "_id=" + _id +
	                ", nom='" + nom + '\'' +
	                ", prenom='" + prenom + '\'' +
	                ", numTel='" + numTel + '\'' +
	                ", email='" + email + '\'' +
	                ", adr='" + adr + '\'' +
	                ", role='" + role + '\'' +
	                '}';
	    }
}
