package iniciante;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 
2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 
valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando 
de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá 
ser apresentado com 2 casas após o ponto.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		
		int codigo1 = scan.nextInt();
		int quant1 = scan.nextInt();
		double preco1 = scan.nextDouble();
		
		int codigo2 = scan.nextInt();
		int quant2 = scan.nextInt();
		double preco2 = scan.nextDouble();
		
		double valorTotal = (quant1 * preco1) + (quant2 * preco2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		scan.close();
	}
}
