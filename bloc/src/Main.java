import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1- Commencer à jouer");
            System.out.println("2- Consulter votre solde");
            System.out.println("3- Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected: Commencer à jouer");
                    break;
                case 2:
                    System.out.println("You selected: Consulter votre solde");
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 3);

        scanner.close();
    }


}
