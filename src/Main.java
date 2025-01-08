import Es_for.Esercizio4;
import Es_ifElse.Esercizio1;
import Es_switch.Esercizio2;
import Es_while.Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Esercizio1 es1 = new Esercizio1();
        boolean pariDispari = es1.stringaPariDispari("penna");
        System.out.println(pariDispari);

        boolean annoBisestile = es1.annoBisestile(2024);
        System.out.println(annoBisestile);

        Esercizio2 es2= new Esercizio2();
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero da 0 a 3");
        int num = sc.nextInt();
        es2.stampaLettere(num);

        Esercizio3 es3 = new Esercizio3();
        es3.suddividiCaratteriWhile();

        Esercizio4 es4 = new Esercizio4();
        System.out.print("Inserisci un numero: ");
        int num2 = sc.nextInt();
        es4.contoAllaRovescia(num2);
        System.out.println("FINE");

    }
}
