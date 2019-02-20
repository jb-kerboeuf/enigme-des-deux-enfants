import java.util.Random;

public class Enigme {
    static Enfant faireUnEnfant(){
        Random random = new Random();
        int i = random.nextInt(2);
        return i == 0 ? Enfant.FILLE : Enfant.GARCON;
    }

    static boolean l_UnEstUneFille(Enfant enfant1, Enfant enfant2) {
        return enfant1 == Enfant.FILLE || enfant2 == Enfant.FILLE;
    }

    static boolean l_AutreEstUneFilleAussi(Enfant enfant1, Enfant enfant2) {
        return enfant1 == Enfant.FILLE && enfant2 == Enfant.FILLE;
    }
}
