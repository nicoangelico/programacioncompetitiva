import java.util.Scanner;
import java.util.Arrays;

//https://omegaup.com/arena/problem/Buscando-Parejas
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Obtengo cantidad de hombres y mujeres
		int HH = scan.nextInt();
		int MM = scan.nextInt();

		//Obtengo edades de los hombres
		byte[] edadH = new byte[HH];
		for (int i = 0; i < HH; i++){
			edadH[i] = scan.nextByte();
		}
		
		//Obtengo edades de las minas
		byte[] edadM = new byte[MM];
		for (int i = 0; i < MM; i++){
			edadM[i] = scan.nextByte();
		}
		
		//Ordeno los arrays
		Arrays.sort(edadH);
		Arrays.sort(edadM);
		
		//Muestro la salida solicitada
		if ((HH-MM) > 0){
			System.out.println((HH-MM)+" "+edadH[0]);
		} else {
			System.out.println("No hay solteros");
		}
		scan.close();
		
	}
}
