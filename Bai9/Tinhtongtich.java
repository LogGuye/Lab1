public class Tinhtongtich {
    public static int tinhtong(int n) {
        n = Math.abs(n);
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }
    public static int tinhtich(int n) {
        n = Math.abs(n);
        if (n == 0) return 0;
        int tich = 1;
        while (n > 0) {
            tich *= n % 10;
            n /= 10;
        }
        return tich;
    }
}
