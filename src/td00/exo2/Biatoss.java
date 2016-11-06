package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Biatoss extends Personnel {

    Date dateEmbauche;
    Date dateFonContrat;
    double salaire;

    public Biatoss(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateEmbauche, Date dateFonContrat, double salaire) {
        super(pnom, pPrenom, pNumSecuriteSocial);
        this.dateEmbauche = dateEmbauche;
        this.dateFonContrat = dateFonContrat;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Biatoss{" +
                "dateEmbauche=" + dateEmbauche +
                ", dateFonContrat=" + dateFonContrat +
                ", salaire=" + salaire +
                "} " + super.toString();
    }
}
