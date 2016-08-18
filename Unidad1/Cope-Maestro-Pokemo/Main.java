import java.util.Scanner;

/*
https://omegaup.com/arena/problem/Cope-Maestro-Pokemon#problems
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();

        int[] pokemons = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            pokemons[i] = sc.nextInt();
        }

        int max = pokemons[numeros - 1];

        int prev = 0, next = 1, result = 0;
        int i = 0;

        StringBuilder builder = new StringBuilder();
        while (result <= max) {
            if (result == pokemons[i]) {
                builder.append(result).append(" ");
                i++;
            }
            result = prev + next;
            prev = next;
            next = result;
            while (i < numeros && result > pokemons[i]){
                i++;
            }
        }
        System.out.println(builder.toString().trim());

    }

}

