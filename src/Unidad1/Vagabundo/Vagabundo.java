import java.util.Scanner;

//https://omegaup.com/arena/problem/Vagabundo#problems
public class Vagabundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int mcm = mcm(a, b);

        int result = (mcm * 2) / ((mcm / a) + (mcm / b));
        System.out.println(result);
    }

    static int mcm(int a, int b) {
        int m = mcd(a, b);
        return (m * (a / m) * (b / m));
    }

    static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return mcd(b, a % b);
        }
    }
}

