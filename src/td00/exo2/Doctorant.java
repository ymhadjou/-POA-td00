package td00.exo2;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Doctorant extends Etudiant {

    public Doctorant(String nom, String prenom, int numSecuriteSocial, boolean boolBoursier) {
        super(nom, prenom, numSecuriteSocial, boolBoursier);
    }

    @Override
    public String toString() {
        return "Doctorant{} " + super.toString();
    }
}
