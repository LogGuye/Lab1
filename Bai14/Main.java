import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String hoten = scanner.nextLine().trim();
        String[] tach = hoten.split("\\s+");
        if (tach.length < 2) {
            System.out.println("Vui lòng nhập đầy đủ Họ và Tên.");
        } else {
            System.out.println("Họ: " + Tachten.getho(tach));
            System.out.println("Tên đệm: " + Tachten.gettendem(tach));
            System.out.println("Tên: " + Tachten.getten(tach));
        }
    }
}
