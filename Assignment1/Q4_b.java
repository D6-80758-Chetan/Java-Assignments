import java.util.Scanner;

public class Q4_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (must be an odd number): ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            int midRow = rows / 2;

            for (int i = 1; i <= midRow + 1; i++) {
                for (int j = 1; j <= midRow + 1 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = midRow; i >= 1; i--) {
                for (int j = 1; j <= midRow + 1 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
