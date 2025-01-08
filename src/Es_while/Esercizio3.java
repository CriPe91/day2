package Es_while;

import java.util.Scanner;

public class Esercizio3 {
    public static void suddividiCaratteriWhile() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Inserisci stringa oppure :q per uscire");
            String input = sc.nextLine();
            if (input.equals(":q")) {
                break;
            }
            String [] arrCaracters = input.split("");
            String newString = String.join(",",arrCaracters);
            System.out.println(newString);
        }

    }

}
