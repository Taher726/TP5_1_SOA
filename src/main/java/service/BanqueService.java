package service;
import jakarta.jws.WebParam;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    // Liste pour stocker des objets de type Compte
    List<Compte> comptes = new ArrayList<Compte>();

    // Méthode de conversion
    @WebMethod
    public double conversion(@WebParam double mt) {
        // Effectue une opération de conversion et renvoie le résultat
        return  mt * 3.3;
    }

    // Méthode pour obtenir un objet Compte par son code
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        // Crée un objet Compte fictif avec le code donné, un solde initial de 0 et une date de création
        return  new Compte(code, 0, new Date());
    }

    // Méthode pour obtenir la liste de tous les Comptes
    @WebMethod
    public List<Compte> getComptes() {
        // Crée deux objets Compte, les ajoute à la liste "comptes" et renvoie la liste
        Compte c1 = new Compte(0, 500, new Date());
        Compte c2 = new Compte(1, 500, new Date());
        comptes.add(c1);
        comptes.add(c2);
        return  comptes;
    }
}
