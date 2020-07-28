package iniciante;

/*
A empresa ABC resolveu conceder um aumento de sal�rios a seus funcion�rios
de acordo com a tabela abaixo:


Sal�rio	              Percentual de Reajuste
0 - 400.00                     15%
400.01 - 800.00                12%
800.01 - 1200.00               10%
1200.01 - 2000.00               7%
Acima de 2000.00                4%


Leia o sal�rio do funcion�rio e calcule e mostre o novo sal�rio, bem como o 
valor de reajuste ganho e o �ndice reajustado, em percentual.

Entrada
A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.

Sa�da
Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e o percentual 
de reajuste ganho, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		double salario = scan.nextDouble();
		
		int percentualReajuste = 0;
		double valorReajuste = 0;
		double novoSalario = 0;
		
		if (salario >= 0 && salario <= 400) {
			percentualReajuste = 15;
			novoSalario = salario + (salario * percentualReajuste) / 100;
			valorReajuste = novoSalario - salario;
		} else if (salario >= 400.01 && salario <= 800) {
			percentualReajuste = 12;
			novoSalario = salario + (salario * percentualReajuste) / 100;
			valorReajuste = novoSalario - salario;
		} else if (salario >= 800.01 && salario <= 1200) {
			percentualReajuste = 10;
			novoSalario = salario + (salario * percentualReajuste) / 100;
			valorReajuste = novoSalario - salario;
		} else if (salario >= 1200.01 && salario <= 2000) {
			percentualReajuste = 7;
			novoSalario = salario + (salario * percentualReajuste) / 100;
			valorReajuste = novoSalario - salario;
		} else if (salario > 2000) {
			percentualReajuste = 4;
			novoSalario = salario + (salario * percentualReajuste) / 100;
			valorReajuste = novoSalario - salario;
		}
		
		System.out.printf("Novo salario: %.2f", novoSalario);
		System.out.printf("\nReajuste ganho: %.2f", valorReajuste);
		System.out.printf("\nEm percentual: %d %%", percentualReajuste);
		
		scan.close();
		
	}
}















