import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();
        boolean checknamnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        if (checknamnhuan) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }
    }
}
