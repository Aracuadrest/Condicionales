import java.util.Scanner;

/** Algoritmo que pida dos enteros y que indique 
 * el mayor y el menor, o si ambos son iguales.
 */
 
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = entrada.nextInt();
		
		if (num1==num2) {
			System.out.println("Los dos son iguales");
		} else if (num1<num2) {
			System.out.println("El menor es: "+num1+"\nEl mayor es: "+num2);
		} else {
			System.out.println("El menor es: "+num2+"\nEl mayor es: "+num1);
		}
	}

}
