public class Uebung5 {
    public static void ausfuehren() {
        int d = 1, e = 2;
        d *= e; // 1 * 2 = 2
        System.out.println("d*=e: " + " d= " + d + " e= " + e);
        d += e++; // 2 + 2 = 4
        System.out.println("d+=e: " + " d= " + d + " e= " + e);
        d -= 3 - 2 * e; // 3 - (2 * 3) = -3 ¦ 4 - (-3) = 7
        System.out.println("d-= 3-2*e: " + " d= " + d + " e= " + e);
        e /= (d + 1); // 3 / 8 = 0 -> Weil es kein Float oder Double ist
        System.out.println("e /= (d+1): " + " d= " + d + " e= " + e);
    }
}
