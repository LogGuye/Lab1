import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int so = scanner.nextInt();
        System.out.println("Đảo ngược: " + Daonguoc.daonguocso(so));
    }
}
