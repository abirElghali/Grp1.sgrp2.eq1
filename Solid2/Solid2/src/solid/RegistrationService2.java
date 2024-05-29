package solid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class RegistrationService2<T> {
    private List<T> database = new ArrayList<>();

    public void inscrire(T entity) {
        // Ajouter l'entité à la base de données
        database.add(entity);
        
        // Afficher un message de confirmation
        System.out.println("Registered: " + entity);
    }

    public List<T> consulterListe() {
        return database;
    }
}
