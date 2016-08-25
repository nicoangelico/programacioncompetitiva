import java.util.Scanner;

public class DoNothing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long seasons;
        long duration;

        while (scan.hasNextInt() && scan.hasNext()) {
            seasons = scan.nextLong();
            duration = scan.nextLong();

            if (seasons == -1 && duration == -1) {
                System.exit(0);
            }

            long episodes;
            long current;
            long time = 0;
            long accumulated = 0;

            for (int i = 0; i < seasons; i++) {
                episodes = scan.nextLong();
                current = episodes * duration;
                time = time + current;
                if (i > 0) {
                    time = time + accumulated;
                }
                accumulated = current + accumulated;
            }
            System.out.println(time);
        }
    }
}
