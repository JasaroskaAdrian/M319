public class Uebung3 {

    public static void printLetter(String name) {

        StringBuffer sb = new StringBuffer();

        sb.append("Sehr geehrte(r) Frau/Herr ");
        sb.append(name);
        sb.append(",\n");
        sb.append("wir gratulieren Ihnen zur erfolgreichen Lösung der ");
        sb.append("Übungsaufgabe.");

        System.out.println(sb);
    }
}