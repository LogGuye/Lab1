import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều cao: ");
        int cc = scanner.nextInt();
        System.out.print("Chiều rộng: ");
        int cr = scanner.nextInt();

        Xeprong55 hinh = new Xeprong55();
        hinh.ve(cc, cr);
    }
}
