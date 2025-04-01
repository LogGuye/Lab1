import java.util.Scanner;

public class Chuyendoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ F: ");
        double F = scanner.nextDouble();
        double C = (F - 32) / 1.8;
        System.out.println("Độ C tương ứng: " + C);
    }
}
