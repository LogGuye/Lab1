import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên n: ");
            int n = scanner.nextInt();
            int ketqua = Tongdayso.tinhtong(n);
            System.out.println("Tổng các chữ số của " + n + " là: " + ketqua);
        }
    }
}
