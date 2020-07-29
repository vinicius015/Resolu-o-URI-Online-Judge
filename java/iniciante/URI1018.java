package iniciante;

/*
	Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis 
(c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de 
100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.

Entrada
	O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

Sa�da
	Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo 
necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha 
ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
*/

import java.io.IOException;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) throws IOException {
    	int notas[] = { 100, 50, 20, 10, 5, 2, 1 };

		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		scan.close();

		int quantNotas = 0;

		System.out.print(valor);
		for (int i = 0; i < notas.length; i++) {
			quantNotas =  valor / notas[i];
			System.out.printf("%n%d nota(s) de R$ %d,00", quantNotas, notas[i]);
			valor -= quantNotas * notas[i];
		}
		
		System.out.println();
	}
}
