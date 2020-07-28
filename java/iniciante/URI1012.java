package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1012 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double areaTriangulo = (a * c) / 2;
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		
		double areaCirculo = Math.pow(c, 2) * 3.14159;
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		double areaTrapezio = ((a + b) * c) / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		
		double areaQuadrado = Math.pow(b, 2);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		
		double areaRetangulo = a*b;
		System.out.printf("RETANGULO: %.3f", areaRetangulo);
	
		System.out.println();
		
		scan.close();
	}
}