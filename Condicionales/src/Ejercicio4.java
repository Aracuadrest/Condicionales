import java.util.Scanner;

/** Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
perpendiculares o no. */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Recta 1: ");
		System.out.println("Introduce el parametro a1:");
		float a1=entrada.nextFloat();
		System.out.println("Introduce el parametro b1:");
		float b1=entrada.nextFloat();
		System.out.println("Introduce el parametro c1:");
		float c1=entrada.nextFloat();
		
		System.out.println("Recta 2: ");
		System.out.println("Introduce el parametro a2:");
		float a2=entrada.nextFloat();
		System.out.println("Introduce el parametro b2:");
		float b2=entrada.nextFloat();
		System.out.println("Introduce el parametro c2:");
		float c2=entrada.nextFloat();

		if ((a1/a2)!=(b1/b2)) {
			System.out.println("Las restas son secantes");
			if((a1/b1)==(-b2/a2)) {
				System.out.println("Las restas son perpendiculares");
			}
		}else  {
			System.out.println("Las restas son paralelas");
			if ((b1/b2)==(c1/c2)) {
				System.out.println("Las restas son coincidentes");
			}
		}

	}

}
