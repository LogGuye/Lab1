import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nhapso;
        do {
            System.out.print("Nhập số nguyên từ 0 đến 100: ");
            nhapso = scanner.nextInt();
        } while (nhapso < 0 || nhapso > 100);

        Gacha ds = new Gacha();
        ds.tim(nhapso);
    }
}
