import java.util.Scanner;

/*
https://omegaup.com/arena/problem/Buscando-Parejas#problems
 */
public class BuscandoP {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int hombres = sc.nextInt();
        int mujeres = sc.nextInt();

        if (mujeres >= hombres){
            System.out.println("No hay solteros");
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < hombres; i++) {
                int edad = sc.nextInt();
                if (edad < min){
                    min = edad;
                }
            }
            System.out.println((hombres-mujeres)+" "+min);
        }

    }

}

