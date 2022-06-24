import java.util.Scanner;

/**Escribir un programa que implemente una peque�a calculadora con switch-case. El 
programa pedir� al usuario los operandos (a y b) y la operaci�n a realizar: suma, resta, 
multiplicaci�n y divisi�n. En funci�n de la opci�n seleccionada se realizar� una de las 
operaciones aritm�ticas. */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el operando a: ");
		double num1=entrada.nextDouble();
		
		System.out.println("Introduce el operando b: ");
		double num2=entrada.nextDouble();
		
		System.out.println("Seleccione una opci�n: ");
		System.out.println("1.Suma ");
		System.out.println("2.Resta ");
		System.out.println("3.Multiplicaci�n ");
		System.out.println("4.Divisi�n ");
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
		default: System.out.println("Opci�n incorrecta. Debe elegir una opci�n entre 1 y 4");
		}
		if (opcion<=4 && opcion>=1) {
			System.out.println("El resultado es: "+res);
		}
	}

}
