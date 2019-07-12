import java.util.Scanner;

public class Rekenmachine {
    public static void main(String args[]){
        Scanner rekenmachine = new Scanner(System.in);
        double eerstenummer, tweedenummer, antwoord1 , antwoord2, antwoord3, antwoord4;
        System.out.println("Vul in het eerste nummer:");
        eerstenummer = rekenmachine.nextDouble();
        System.out.println("Vul in het tweede nummer:");
        tweedenummer = rekenmachine.nextDouble();
        antwoord1 = eerstenummer + tweedenummer;
        antwoord2 = eerstenummer - tweedenummer;
        antwoord3 = eerstenummer * tweedenummer;
        antwoord4 = eerstenummer / tweedenummer;

        System.out.println(antwoord1);
        System.out.println(antwoord2);
        System.out.println(antwoord3);
        System.out.println(antwoord4);

    }
}
