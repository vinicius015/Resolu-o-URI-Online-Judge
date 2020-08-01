package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		
		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		int duracao;
		
		if (horaFinal <= horaInicial) {
			duracao = 24 - (Math.abs(horaFinal - horaInicial));
		} else {
			duracao = horaFinal - horaInicial;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
		scan.close();
	}
}
