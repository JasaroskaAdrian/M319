public class Uebung4 {
    public static void printLetter1(String name) {
        StringBuilder sb = new StringBuilder();

        sb.append("Sehr geehrte(r) Frau/Herr ,\n");
        sb.append("wir gratulieren Ihnen zur erfolgreichen Lösung der ");
        sb.append("Übungsaufgabe. (INSERT)");

        sb.insert(26, name);
        System.out.println(sb);
    }
}
