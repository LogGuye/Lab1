public class Tongdayso {
    public static int tinhtong(int n) {
        n = Math.abs(n);
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }
}
