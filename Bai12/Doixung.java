public class Doixung {
    public static int daonguoc(int n) {
        int sogoc = Math.abs(n);
        int dao = 0;
        while (sogoc > 0) {
            dao = dao * 10 + sogoc % 10;
            sogoc /= 10;
        }
        return (n < 0) ? -dao : dao;
    }
    public static boolean check(int n) {
        return n == daonguoc(n);
    }
}
