public class Timkiem {
    public static int sodau(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public static int socuoi(int n) {
        return Math.abs(n % 10);
    }
}