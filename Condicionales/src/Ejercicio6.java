import java.util.Scanner;

/**Escribir un programa que implemente una pequeña calculadora con switch-case. El 
programa pedirá al usuario los operandos (a y b) y la operación a realizar: suma, resta, 
multiplicación y división. En función de la opción seleccionada se realizará una de las 
operaciones aritméticas. */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el operando a: ");
		double num1=entrada.nextDouble();
		
		System.out.println("Introduce el operando b: ");
		double num2=entrada.nextDouble();
		
		System.out.println("Seleccione una opción: ");
		System.out.println("1.Suma ");
		System.out.println("2.Resta ");
		System.out.println("3.Multiplicación ");
		System.out.println("4.División ");
		int opcion=entrada.nextInt();
		
		double res=0;
		
		switch (opcion) {
		case 1:
			res = num1+num2;
			break;
		case 2:
			res = num1-num2;
			break;
		case 3:
			res = num1*num2;
			break;
		case 4:
			res = num1/num2;
			break;
		default: System.out.println("Opción incorrecta. Debe elegir una opción entre 1 y 4");
		}
		if (opcion<=4 && opcion>=1) {
			System.out.println("El resultado es: "+res);
		}
	}

}
