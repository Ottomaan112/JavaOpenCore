import java.util.Scanner;

public class Gastenlijst {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guests[0] = "Manuela";
        guests[1] = "Daphne";
        guests[2] = "Madelyn";
        guests[3] = "Marit";
        guests[4] = "Sue";
        guests[5] = "Sena";

        do {
            displayGasten();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name  ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            } else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            } else if (option == 3) {
                break;
            }

        } while (true);

        System.out.println("Exiting...");
    }

    static void displayGasten() {
        System.out.println("______________________________\n- Guest -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println(guests[i] == null ? "--" : guests[i]);
        }
    }

    static void displayMenu() {
        System.out.println("______________________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");

    }

    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }
}