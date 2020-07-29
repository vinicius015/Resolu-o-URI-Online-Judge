package iniciante;

/*
	Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
	O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
	Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		double valor = scan.nextDouble();
		int quantNotas;
		int quantMoedas;
		
		System.out.println("NOTAS:");
		
		quantNotas = (int) valor / 100;
		valor -= quantNotas * 100;
		System.out.println(quantNotas +  " nota(s) de R$ 100.00");
		
		quantNotas = (int) valor / 50;
		valor -= quantNotas * 50;
		System.out.println(quantNotas +  " nota(s) de R$ 50.00");
		
		quantNotas = (int) valor / 20;
		valor -= quantNotas * 20;
		System.out.println(quantNotas +  " nota(s) de R$ 20.00");
		
		quantNotas = (int) valor / 10;
		valor -= quantNotas * 10;
		System.out.println(quantNotas +  " nota(s) de R$ 10.00");
		
		quantNotas = (int) valor / 5;
		valor -= quantNotas * 5;
		System.out.println(quantNotas +  " nota(s) de R$ 5.00");
		
		quantNotas = (int) valor / 2;
		valor -= quantNotas * 2;
		System.out.println(quantNotas +  " nota(s) de R$ 2.00");

		System.out.println("MOEDAS:");
		quantMoedas = (int) valor / 1;
		valor -= quantMoedas * 1;
		System.out.println(quantMoedas + " moeda(s) de R$ 1.00");
		
		quantMoedas = (int) (valor / 0.50);
		valor -= quantMoedas * 0.50;
		System.out.println(quantMoedas + " moeda(s) de R$ 0.50");
		
		quantMoedas = (int) (valor / 0.25);
		valor -= quantMoedas * 0.25;
		System.out.println(quantMoedas + " moeda(s) de R$ 0.25");
		
		quantMoedas = (int) (valor / 0.10);
		valor -= quantMoedas * 0.10;
		System.out.println(quantMoedas + " moeda(s) de R$ 0.10");
		
		quantMoedas = (int) (valor / 0.05);
		valor -= quantMoedas * 0.05;
		System.out.println(quantMoedas + " moeda(s) de R$ 0.05");
		
		quantMoedas = (int) (valor / 0.01);
		valor -= quantMoedas * 0.01;
		System.out.println(quantMoedas + " moeda(s) de R$ 0.01");
		
		System.out.println();
		
		scan.close();

	}

}
