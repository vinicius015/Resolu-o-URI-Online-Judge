package iniciante;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.util.Scanner;


public class URI1021 {

	public static void main(String[] args) {
		double notas[] = { 100, 50, 20, 10, 5, 2 };
		double moedas[] = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		scan.close();

		int quantNotas = 0;
		int quantMoedas = 0;

		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			quantNotas = (int) (valor / notas[i]);
			System.out.printf("%d nota(s) de R$ %.2f%n", quantNotas, notas[i]);
			valor -= quantNotas * notas[i];
		}
		
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			quantMoedas = (int) (valor / moedas[i]);
			System.out.printf("%d moeda(s) de R$ %.2f%n", quantMoedas, moedas[i]);
			valor -= quantMoedas * moedas[i];
		}
	}

}
