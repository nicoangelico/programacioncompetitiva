import java.util.Scanner;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2059
 */
public class Oec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();

        int oddoreven = 0;
        if ((j1 + j2) % 2 == 0) {
            oddoreven = 1;
        }

        if ((p == oddoreven && r == 0)
            || (r == 1 && a == 0)
            || (r == 0 && a == 1))
        {
            System.out.println("Jogador 1 ganha!");
        } else {
            System.out.println("Jogador 2 ganha!");
        }

    }
}
