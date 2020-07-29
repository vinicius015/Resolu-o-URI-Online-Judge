package iniciante;

/*
	Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 
100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
	O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
	Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo 
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha 
após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
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
