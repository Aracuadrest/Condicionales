
import java.util.Scanner;

/** Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
posición central si los tres se ordenasen. */

		
public class Ejercicio2b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		float num1 = entrada.nextFloat();
		System.out.println("Introduce otro número: ");
		float num2 = entrada.nextFloat();
		System.out.println("Introduce otro número: ");
		float num3 = entrada.nextFloat();

		if (num1>Math.min(num2, num3) && num1<Math.max(num2, num3)) {
			System.out.println("El numero central es: "+num1);
		} else if (num2>Math.min(num1, num3) && num2<Math.max(num1, num3)) {
			System.out.println("El numero central es: "+num2);
		}else {
			System.out.println("El numero central es: "+num3);
		}
	}

}
