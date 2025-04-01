public class Bang9chuong {
    public void in() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %-3d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
