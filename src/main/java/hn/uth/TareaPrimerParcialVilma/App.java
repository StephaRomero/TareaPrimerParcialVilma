package hn.uth.TareaPrimerParcialVilma;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int opcion = 0;
      
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = calcularAreaCirculo(leerDecimalTeclado("Ingrese el radio, por favor:"));
        	}else if(opcion == 2) {
        		resultado = calcularAreaCuadrado(leerDecimalTeclado("Ingrese el lado del cuadrado, por favor:"));

        	}else if(opcion == 3) {
        		resultado = calcularAreaRectangulo(leerDecimalTeclado("Ingrese la base del rectánuglo:"),leerDecimalTeclado("Ingrese la altura del rectángulo:"));

        	}else if(opcion == 4) {
        		resultado = calcularAreaTriangulo(leerDecimalTeclado("Ingrese la base del triángulo, por favor:"),leerDecimalTeclado("Ingrese la altura, por favor:"));
}else {
        		System.out.println("====================  Terminando ==================== ");
        		
        	}
        	System.out.println("El resultado de la operación es: "+resultado);
        }
    }
    
    private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		
		System.out.println("==============  CALCULADORA ESTUDIANTIL ============");
		System.out.println("------------- 1. Área círculo ----------------------");
		System.out.println("------------- 2. Área cuadrado ---------------------");
		System.out.println("------------- 3. Área rectángulo -------------------");
		System.out.println("------------- 4. Área triángulo --------------------");
		System.out.println("------------- 5. Salida ----------------------------");
		System.out.println("============= Escoja una opción ==================== ");
	}

	public static double calcularAreaCuadrado(double lado) {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public static double calcularAreaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return (base * altura) / 2.0;
	}

	public static double calcularAreaRectangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public static double calcularAreaCirculo(double radio) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}


}
