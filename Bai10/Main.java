import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int so = scanner.nextInt();

        System.out.println("Số lượng số là: " + Demso.demchuso(so));
    }
}
