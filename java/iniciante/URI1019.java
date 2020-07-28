package iniciante;

/*
	Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
	O arquivo de entrada contém um valor inteiro N.

Saída
	Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) throws IOException {
		
        Scanner scan = new Scanner (System.in);
        int segundos = scan.nextInt();
        
        int horas = segundos / 3600;
        segundos -= horas * 3600;
        
        int minutos = segundos / 60;
        segundos -= minutos * 60;
        
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
        System.out.println();
        
        scan.close();
	}
}
