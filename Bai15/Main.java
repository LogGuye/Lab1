import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày (dd/mm/yyyy): ");
        String ngaythang = scanner.nextLine().trim();
        String[] tach = Tachngay.tach(ngaythang);
        if (tach.length != 3) {
            System.out.println("Vui lòng nhập lại dd/mm/yyyy.");
        } else {
            System.out.println("Ngày: " + tach[0]);
            System.out.println("Tháng: " + tach[1]);
            System.out.println("Năm: " + tach[2]);
        }
    }
}
