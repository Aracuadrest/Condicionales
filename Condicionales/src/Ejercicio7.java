import java.util.Scanner;

/** Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que 
calcule los impuestos que debe pagar según la siguiente tabla de tramos: 
Tramo        Impuesto (%) Descuento 
0 a 1000           0       No aplicable 
1000 a 1600        5       1% por hijo (máximo 10%) 
1600 a 3000       10       1% por hijo (máximo 10%) 
3000 a 4600       15       1% por hijo (máximo 10%) 
> 4600            20       1.5% por hijo (máximo 15%) */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el sueldo bruto: ");
		float sueldo=entrada.nextFloat();
		
		System.out.println("Introduce numeros de hijos: ");
		int hijos=entrada.nextInt();
		float impuesto=0;
		float descuento=0;
		
		if (sueldo>1000 && sueldo<1600) {
			impuesto=0.05f;
			descuento=0.01f*hijos;
				if(descuento>0.1f) {
					descuento=0.1f;
				}
			
		}else if(sueldo>=1600 && sueldo<3000) {
			impuesto=0.1f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}else if(sueldo>=3000 && sueldo<4600) {
			impuesto=0.15f;
			descuento=Math.min(0.1f, 0.01f*hijos);
		}else if(sueldo>=4600) {
			impuesto=0.2f;
			descuento=Math.min(0.15f, 0.015f*hijos);
		}
		float impuestosTotales=sueldo*impuesto;
		
		impuestosTotales= impuestosTotales-impuestosTotales*descuento;
		
		System.out.println("Los impuestos a pagar son: "+impuestosTotales);


}
}
		