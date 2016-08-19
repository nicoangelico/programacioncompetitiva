import java.util.*;
//http://codeforces.com/contest/58/
public class Coins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n >= 1){
            for (int i = n; i >= 1; i--){
                if (n%i == 0){
                    System.out.print(i + " ");
                    n = i;
                }
            }
        }
    }
}
