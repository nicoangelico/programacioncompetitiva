import java.util.Scanner;

/** https://www.urionlinejudge.com.br/judge/en/problems/view/1534 **/
public class Array123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt() && scan.hasNext()) {
            int x = scan.nextInt();

            int[][] a = new int[x][x];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    a[i][j] = 3;
                }
            }

            for (int i = 0; i < x; i++) {
                a[i][i] = 1;
                a[i][(x - 1) - i] = 2;
            }


            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}

