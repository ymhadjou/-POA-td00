package td00.exo2;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class Personnel {

        String nom;
        String prenom;
        int numSecuriteSocial;

    Personnel(String pnom, String pPrenom,int pNumSecuriteSocial)
    {
        this.nom = pnom;
        this.prenom = pPrenom;
        this.numSecuriteSocial = pNumSecuriteSocial;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecuriteSocial=" + numSecuriteSocial +
                '}';
    }
}
