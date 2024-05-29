package solid;

import java.util.HashMap;
import java.util.Map;

public class Authentication {
	
	 private Map<String, String> credentials; // Map pour stocker les emails et les mots de passe

	    public Authentication() {
	        this.credentials = new HashMap<>();
	    }

	    private boolean authenticate(String email, String MPass) {
	        // Vérifier si l'email existe dans la Map
	        if (credentials.containsKey(email)) {
	            // Comparer le mot de passe associé à cet email
	            return credentials.get(email).equals(MPass);
	        }
	 
	        return false;
	    }
}
