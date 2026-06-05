public class Uebung4 {
    public static void ausfuehren() {
        int d = 1, e = 2;
        d *= e; // 1 * 2 = 2
        d += e++; // 2 + 2 = 4
        d -= 3 - 2 * e; // 3 - (2 * 3) = -3 ¦ 4 - (-3) = 7
        e /= (d + 1); // 3 / 8 = 0 -> Weil es kein Float oder Double ist
    }
}
