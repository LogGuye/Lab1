import java.util.Scanner;

public class Xeprank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Điểm Hóa: ");
        double hoa = scanner.nextDouble();
        System.out.print("Điểm Sinh: ");
        double sinh = scanner.nextDouble();
        System.out.print("Điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.print("Điểm Máy tính: ");
        double calculator = scanner.nextDouble();
        double diem = ly + hoa + sinh + toan + calculator;
        double percent = (diem / 50) * 100;
        String top;
        if (percent > 90) top = "A";
        else if (percent > 80) top = "B";
        else if (percent > 70) top = "C";
        else if (percent > 60) top = "D";
        else if (percent > 40) top = "E";
        else top = "F";
        System.out.println("Tỷ lệ phần trăm: " + percent + "%");
        System.out.println("Xếp hạng: " + top);
    }
}
