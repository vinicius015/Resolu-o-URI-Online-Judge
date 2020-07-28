package iniciante;

/*
	Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos
em uma viagem, ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria 
que voc� o auxiliasse atrav�s de um simples programa. Para efetuar o c�lculo, 
deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante 
a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular 
quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.

	Entrada
O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem 
(em horas) e o segundo � a velocidade m�dia durante a mesma (em km/h).

	Sa�da
Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos 
ap�s o ponto decimal
 */

import java.util.Scanner;
import java.io.IOException;

public class URI1017  {

	public static void main(String[] args) throws IOException {

	    final int gastoCombustivel= 12;
	    
	    Scanner scan = new Scanner(System.in);
	    int tempo = scan.nextInt();
	    int velocidadeMedia = scan.nextInt();
	    
	    double distanciaPercorrida = tempo * velocidadeMedia;
	    double litros = distanciaPercorrida / gastoCombustivel;
	    
	    System.out.printf("%.3f", litros);
	    System.out.println();
	    
	    scan.close();
	}
}
