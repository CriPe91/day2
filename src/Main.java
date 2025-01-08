import exDay2.exswitch;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("penna"));
        System.out.println(annoBisestile(2025));
exswitch e1 = new exswitch();
    }

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
