public class Uebung2 {
    public static void ausfuhren() {
        String name1 = "Mayer";
        String name2 = "Meier";

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1.toLowerCase());
            System.out.println(name2.toLowerCase());
        } else {
            System.out.println(name2.toLowerCase());
            System.out.println(name1.toLowerCase());
        }
    }
}
