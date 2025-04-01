public class Demtu {
    public static int sotu(String chuoi) {
        if (chuoi == null || chuoi.trim().isEmpty()) return 0;
        String[] tu = chuoi.trim().split("\\s+");
        return tu.length;
    }
}
