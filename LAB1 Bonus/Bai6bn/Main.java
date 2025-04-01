import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên n: ");
            int n = scanner.nextInt();
            Chanle tinh = new Chanle();
            int ketqua = tinh.chanLe(n);
            if (n % 2 == 0) {
                System.out.println("Tổng các số chẵn từ 2 đến " + n + " là: " + ketqua);
            } else {
                System.out.println("Tổng các số lẻ từ 1 đến " + n + " là: " + ketqua);
            }
        }
    }
}
