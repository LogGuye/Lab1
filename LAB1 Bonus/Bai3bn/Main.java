import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int cc = scanner.nextInt();
        Xep3gocso tamgiac = new Xep3gocso();
        tamgiac.ve(cc);
    }
}
