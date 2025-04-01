import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int cao = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int rong = scanner.nextInt();
        Xep55.in(cao, rong);
    }
}
