package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Professeur extends EnseignantPermanant {

    public Professeur(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateRecrutement, double salaire, String domaine) {
        super(pnom, pPrenom, pNumSecuriteSocial, dateRecrutement, salaire, domaine);
    }

    @Override
    public String toString() {
        return "Professeur{} " + super.toString();
    }
}
