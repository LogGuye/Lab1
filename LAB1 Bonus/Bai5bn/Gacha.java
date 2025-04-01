import java.util.Random;
public class Gacha {
    public void tim(int sodich) {
        Random random = new Random();
        int dembc = 0;
        int so;
        System.out.println("Bắt đầu gacha");
        do {
            so = random.nextInt(101);
            dembc++;
            System.out.println("Bước " + dembc + ": " + so);
        } while (so != sodich);
        System.out.println("Tìm thấy " + sodich + " sau " + dembc + " bước");
    }
}
