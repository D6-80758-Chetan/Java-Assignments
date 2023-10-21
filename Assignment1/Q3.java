import java.util.Scanner;

public class Q3 {

    private static final double[] prices = { 45, 12, 25, 15, 15, 20, 25, 20, 15, 10 };
    private static final String[] dishes = { "Dosa", "Samosa", "Idli", "Jalebi", "Vadapav", "Meduvada", "Paratha",
            "Poha", "Kachori",
            "Mangode" };

    private static int menu(Scanner sc) {
        int choice;
        System.out.println("0. EXIT");

        for (int i = 1; i <= dishes.length; i++) {
            System.out.println(String.format("%d. %s %.2f /-", i, dishes[i - 1], prices[i - 1]));
        }
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        double totalPrice = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            choice = menu(sc);
            if (choice != 0) {
                if (choice > dishes.length) {
                    System.out.println("Wrong Choice ");
                    continue;
                }
                System.out.print("Enter the Quantity: ");
                int quantity = sc.nextInt();
                totalPrice += prices[choice - 1] * quantity;

            } else if (choice == 0) {
                printBill(totalPrice);
                System.out.println("Bye");
                System.exit(0);
            } else {
                System.out.println("Wrong Choice ");
            }
        }
    }

    private static void printBill(double totalPrice) {
        System.out.println(String.format("Your Bill is %s", totalPrice));
    }
}
