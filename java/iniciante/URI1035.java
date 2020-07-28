package iniciante;

/*
	Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do 
que C e se D for maior do que A, e a soma de C com D for maior que 
a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A 
for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

Entrada
	Quatro n�meros inteiros A, B, C e D.

Sa�da
	Mostre a respectiva mensagem ap�s a valida��o dos valores.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if ((b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a % 2 == 0)) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valora nao aceitos");
		}

		scan.close();
	}
}
