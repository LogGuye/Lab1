import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Số từ của chuỗi là: " + Demtu.sotu(chuoi));
    }
}
