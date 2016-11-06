package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Bibliothecaire extends Biatoss {

    public Bibliothecaire(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateEmbauche, Date dateFonContrat, double salaire) {
        super(pnom, pPrenom, pNumSecuriteSocial, dateEmbauche, dateFonContrat, salaire);
    }


    @Override
    public String toString() {
        return "Bibliothecaire{} " + super.toString();
    }
}
