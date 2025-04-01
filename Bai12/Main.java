import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int so = scanner.nextInt();
        if (Doixung.check(so)) {
            System.out.println(so + " đối xứng.");
        } else {
            System.out.println(so + " không đối xứng.");
        }
    }
}
