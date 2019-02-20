import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EnigmeTest {
    @Test
    public void faireUnEnfantDoitAvoirAutantDeChanceDeDonnerUnGarconQuneFille() {
        double filles = 0;
        double garcons = 0;

        for (int i = 0; i < 10000; i++) {
            Enfant enfant = Enigme.faireUnEnfant();
            if (enfant == Enfant.FILLE) filles += 1;
            else garcons += 1;
        }

        double proba = filles / garcons;
        Assert.assertTrue(proba < 1.1 && proba > 0.9);
    }

    @Test
    public void test() {
        double l_UnEstUneFille = 0;
        double l_AutreEstUneFilleAussi = 0;

        for (int i = 0; i < 10000; i++) {
            Enfant enfant1 = Enigme.faireUnEnfant();
            Enfant enfant2 = Enigme.faireUnEnfant();
            if (Enigme.l_UnEstUneFille(enfant1, enfant2)) {
                l_UnEstUneFille += 1;
                if (Enigme.l_AutreEstUneFilleAussi(enfant1, enfant2)) {
                    l_AutreEstUneFilleAussi += 1;
                }
            }
        }

        double proba = l_AutreEstUneFilleAussi / l_UnEstUneFille;
        System.out.println(proba);
    }
}
