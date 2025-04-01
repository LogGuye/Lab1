public class Tachten {
    public static String getho(String[] tach) {
        return tach[0];
    }
    public static String getten(String[] tach) {
        return tach[tach.length - 1];
    }
    public static String gettendem(String[] tach) {
        String tendem = "";
        for (int i = 1; i < tach.length - 1; i++) {
            tendem += tach[i] + " ";
        }
        return tendem.trim();
    }
}
