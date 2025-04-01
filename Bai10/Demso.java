public class Demso {
    public static int demchuso(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int dem = 0;
        while (n > 0) {
            dem++;
            n /= 10;
        }
        return dem;
    }
}
