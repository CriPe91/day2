package Es_switch;

public class Esercizio2 {
    public static void stampaLettere(int num){
        switch(num){
            case 0:{
                System.out.println("zero");
                break;
            }
            case 1:{
                System.out.println("uno");
                break;
            }
            case 2:{
                System.out.println("due");
                break;
            }
            case 3:{
                System.out.println("tre");
                break;
            }
            default: {
                System.out.println("valore errato");
                break;
            }
        }
    }
}
