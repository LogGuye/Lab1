import java.util.Scanner;
public class Shcn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double cd = scanner.nextDouble();
        System.out.print("Chiều rộng: ");
        double cr = scanner.nextDouble();
        double S = cd * cr;
        System.out.println("S hình chữ nhật: " + S);
    }
}
