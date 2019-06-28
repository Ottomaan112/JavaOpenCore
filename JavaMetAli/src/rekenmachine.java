import java.util.Scanner;

public class rekenmachine {
    public static void main(String args[]){
        Scanner rekenmachine = new Scanner(System.in);
        double eerstenummer, tweedenummer, antwoord;
        System.out.println("Vul in het eerste nummer:");
        eerstenummer = rekenmachine.nextDouble();
        System.out.println("Vul in het tweede nummer:");
        tweedenummer = rekenmachine.nextDouble();
        antwoord = eerstenummer + tweedenummer;
        System.out.println(antwoord);
    }
}
