import java.util.Scanner;

public class Gastenlijst {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        testNamen();

        do {
            displayGasten();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2){
                insertGuest();
            }
            else if (option == 3) {
                renameGuest();
            }
            else if (option == 4) {
                removeGuest();
            }
            else if (option == 5) {
                break;
            }

        } while (true);

        System.out.println("Exiting...");
    }

    static void displayGasten() {
        System.out.println("______________________________\n- Gasten -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("Gastenlijst is leeg");
        }
    }

    static void displayMenu() {
        System.out.println("______________________________\n- Menu -\n");
        System.out.println("1 - Gast toevoegen");
        System.out.println("2 - Gast invoegen");
        System.out.println("3 - Gast aanpassen");
        System.out.println("4 - Gast verwijderen");
        System.out.println("5 - Uitschakelen");

    }

    static int getOption() {
        System.out.print("Optie: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Naam:  ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void insertGuest() {
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > number - 1; i--) {
                guests[i] = guests[i - 1];
            }

            guests[number - 1] = name;
        }
        else {
            System.out.println("\nError: Er is geen gast beschikbaar met dat nummer.");
        }
    }

    static void renameGuest() {
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            guests[number - 1] = name;
        }
        else {
            System.out.println("\nError: Er is geen gast beschikbaar met dat nummer.");
        }
    }


    static void removeGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            guests[number - 1] = null;

            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            }
            guests = temp;
        }
        else {
            System.out.println("\nError: Er is geen gast beschikbaar met dat nummer.");
        }
    }
    static void testNamen() {
        guests[0] = "Manuela";
        guests[1] = "Daphne";
        guests[2] = "Madelyn";
        guests[3] = "Marit";
        guests[4] = "Sue";
        guests[5] = "Sena";
    }
}