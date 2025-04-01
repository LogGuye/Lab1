public class Xeprong55 {
    public void ve(int cc, int cr) {
        for (int i = 1; i <= cc; i++) {
            for (int j = 1; j <= cr; j++) {
                if (i == 1 || i == cc || j == 1 || j == cr) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
