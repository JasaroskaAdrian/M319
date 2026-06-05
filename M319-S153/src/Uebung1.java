public class Uebung1 {
    public static void ausfuhren() {
        String name1 = "Mayer";
        String name2 = "Meier";

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1);
            System.out.println(name2);
        } else {
            System.out.println(name2);
            System.out.println(name1);
        }
    }
}
