package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public abstract class Enseignant extends Personnel {
    Date dateRecrutement;
    double salaire;

    public Enseignant(String pnom, String pPrenom, int pNumSecuriteSocial,Date dateRecrutement, double salaire) {
        super(pnom, pPrenom, pNumSecuriteSocial);
        this.dateRecrutement = dateRecrutement;
        this.salaire=salaire;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "dateRecrutement=" + dateRecrutement +
                ", salaire=" + salaire +
                "} " + super.toString();
    }
}
