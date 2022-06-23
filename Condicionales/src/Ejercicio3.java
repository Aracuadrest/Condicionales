import java.util.Scanner;

/**. Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar 
si están en la misma fila, columna, o en la misma diagonal. */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pieza 1: ");
		System.out.println("Introduce la fila:");
		int fila1=entrada.nextInt();
		System.out.println("Introduce la columna:");
		int col1=entrada.nextInt();
		
		System.out.println("Pieza 2: ");
		System.out.println("Introduce la fila:");
		int fila2=entrada.nextInt();
		System.out.println("Introduce la columna:");
		int col2=entrada.nextInt();

		if (fila1==fila2) {
			System.out.println("Las piezas estan en la misma fila");
		}else if (col1==col2) {
			System.out.println("Las piezas estan en la misma columna");
		}else if ((fila1-fila2) == (col1-col2)) {
			System.out.println("La segunda está en la diagonal principal de la otra");
		}else if (((fila1-fila2) + (col1-col2))== 0) {
			System.out.println("La segunda está en la diagonal secundaria de la otra");
		}else {
			System.out.println("No hay piezas para comer");
		}
	}
	

}
