package iniciante;

/*
Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 
2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 
valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Sa�da
A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando 
de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". O valor dever� 
ser apresentado com 2 casas ap�s o ponto.
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
