public class Uebung3 {
    public static void ausfuehren() {
        int x = 0;

        // Möglichkeit 1
        x = x + 1;                                      // kürzer: x = x++;
        System.out.println("Möglichkeit 1: " + x);

        // Möglichkeit 2
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                x = i;
                System.out.println("Möglichkeit 2: " + x);
            }
        }

        // Möglichkeit 3
        int y = 1;
        x = y;
        System.out.println("Möglichkeit 3: " + x);
    }
}
