package td00.exo2;

import java.util.Date;

/**
 * Created by yamhadjo on 20/09/2016.
 */
public class Main {

    public static void main(String[] args) {
        Date d1 = new Date();
        Personnel p1  = new Etudiant("mhadjou","yasmina",44,true);
//

        Etudiant et1 = new Doctorant("Agesilas","Kevin",25242,false);
        EnseignantPermanant professeur = new Professeur("Dupon", "marc", 42, d1.getDate(), 1200,"informatique");
        EnseignantPermanant maitreDeConference = new MaitreDeConference("Choi","Minho",545,d1,2500,"danse");
        EnseignantTemporaire ater = new Ater("kim","Junsu",354,d1,599,d1);
        EnseignantTemporaire vacataire = new Vacataire("kim","Junsu",354,d1,599,d1);

        Biatoss secretaire = new Secretaire("Agesilas","Kevin",786,d1,d1,1200);
        Biatoss bibliothecaire = new Bibliothecaire("Agesilas","Kevin",786,d1,d1,1200);

        System.out.println(p1.toString());
        System.out.println(et1.toString());
        System.out.println(professeur.toString());
        System.out.println(maitreDeConference.toString());
        System.out.println(ater.toString());
        System.out.println(vacataire.toString());
        System.out.println(secretaire.toString());
        System.out.println(bibliothecaire.toString());




    }

}
