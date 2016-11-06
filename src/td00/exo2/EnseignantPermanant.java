package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class EnseignantPermanant extends Enseignant {

    String domaine;

    public EnseignantPermanant(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateRecrutement, double salaire, String domaine) {
        super(pnom, pPrenom, pNumSecuriteSocial, dateRecrutement, salaire);
        this.domaine = domaine;
    }

    @Override
    public String toString() {
        return "EnseignantPermanant{" +
                "domaine='" + domaine + '\'' +
                "} " + super.toString();
    }
}
