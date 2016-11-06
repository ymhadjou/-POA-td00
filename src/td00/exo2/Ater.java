package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Ater extends EnseignantTemporaire {

    public Ater(String pnom, String pPrenom, int pNumSecuriteSocial, Date dateRecrutement, double salaire, Date dateDepart) {
        super(pnom, pPrenom, pNumSecuriteSocial, dateRecrutement, salaire, dateDepart);
    }

    @Override
    public String toString() {
        return "Ater{} " + super.toString();
    }
}
