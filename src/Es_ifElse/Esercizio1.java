package Es_ifElse;

public class Esercizio1 {
    public static boolean stringaPariDispari(String par) {
        if (par.length() % 2 == 0) {
            return (true);
        } else {
            return (false);

        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            return (true);
        } else if (anno % 100 == 0 && anno % 400 == 0) {
            return (true);
        } else {
            return (false);
        }
    }
}
