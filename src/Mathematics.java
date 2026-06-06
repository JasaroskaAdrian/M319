public class Mathematics {
    public static double calculate(double N1, double N2, char Operator) {
        double Result = 0;
        if (Operator == '+') {
            Result = N1 + N2;
        } else if (Operator == '-') {
            Result = N1 - N2;
        } else if (Operator == '*') {
            Result = N1 * N2;
        } else if (Operator == '/') {
            Result = N1 / N2;
        } else {
            System.out.println("Unknown Operator: " + Operator);
        }
        return Result;
    }
}
