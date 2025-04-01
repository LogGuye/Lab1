import java.util.Scanner;
public class Timsnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số một: ");
        double so1 = scanner.nextDouble();
        System.out.print("Nhập số hai: ");
        double so2 = scanner.nextDouble();
        System.out.print("Nhập số ba: ");
        double so3 = scanner.nextDouble();
        double nn = Math.min(so1, Math.min(so2, so3));
        System.out.println("Số nhỏ nhất là: " + nn);
    }
}
