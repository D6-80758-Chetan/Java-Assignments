import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1;
        double d2;

        if (sc.hasNextDouble()) {
            d1 = sc.nextDouble();
            System.out.println(d1);
        } else {
            System.out.println("This is not double");
            System.exit(0);
        }

        if (sc.hasNextDouble()) {
            d2 = sc.nextDouble();
            System.out.println(d2);
        } else {
            System.out.println("This is not double");
            System.exit(0);
        }
    }
}
