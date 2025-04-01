public class Daonguoc {
    public static int daonguocso(int n) {
        int sogoc = Math.abs(n);
        int dao = 0;
        while (sogoc > 0) {
            dao = dao * 10 + sogoc % 10;
            sogoc /= 10;
        }
        return (n < 0) ? -dao : dao;
    }
}
