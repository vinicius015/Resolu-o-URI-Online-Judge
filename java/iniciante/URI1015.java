package iniciante;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre 
eles, mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:

Distancia = raizQuadrada((x2 - x1)^2 + (y2 - y1)^2) 

Entrada
O arquivo de entrada cont�m duas linhas de dados. A primeira linha cont�m 
dois valores de ponto flutuante: x1 y1 e a segunda linha cont�m dois valores 
de ponto flutuante x2 y2.

Sa�da
Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com 4 
casas ap�s o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double distancia = Math.sqrt(
				(Math.pow(x2, 2) - (2*x2*x1) + Math.pow(x1, 2)) 
				+ 
				(Math.pow(y2, 2) - (2*y2*y1) + Math.pow(y1, 2)));
		
		System.out.printf("%.4f", distancia);
		System.out.println();
	
		scan.close();
		
	}
}
