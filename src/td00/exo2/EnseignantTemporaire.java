package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class EnseignantTemporaire extends Enseignant {

    Date dateDepart;
    public EnseignantTemporaire(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateRecrutement, double salaire, Date dateDepart) {
        super(pnom, pPrenom, pNumSecuriteSocial, dateRecrutement, salaire);
        this.dateDepart = dateDepart;
    }

    @Override
    public String toString() {
        return "EnseignantTemporaire{" +
                "dateDepart=" + dateDepart +
                "} " + super.toString();
    }
}
