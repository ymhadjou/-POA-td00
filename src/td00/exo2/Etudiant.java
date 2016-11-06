package td00.exo2;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Etudiant extends Personnel {

    boolean boursier;

    Etudiant(String nom, String prenom, int numSecuriteSocial, boolean boolBoursier)
    {
        super(nom,prenom,numSecuriteSocial);
        boolBoursier = boolBoursier;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "boursier=" + boursier +
                "} " + super.toString();
    }
}
