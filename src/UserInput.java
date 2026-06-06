import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static void start() {
        System.out.println("Enter first Number: ");
        double Number1 = sc.nextDouble();
        System.out.println("Enter second Number: ");
        double Number2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter operator (+, -, *, /): ");
        char Operator = sc.nextLine().charAt(0);

        double Result = Mathematics.calculate(Number1, Number2, Operator);
        System.out.println(Result);
    }
}
