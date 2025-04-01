import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int so = scanner.nextInt();

        System.out.println("Tổng chữ số: " + Tinhtongtich.tinhtong(so));
        System.out.println("Tích chữ số: " + Tinhtongtich.tinhtich(so));
    }
}
