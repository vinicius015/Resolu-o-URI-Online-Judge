package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		
		int horaInicial = scan.nextInt();
		int minutoInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		int minutoFinal = scan.nextInt();
		
		int tempoInicial = minutoInicial + (horaInicial * 60);
		int tempoFinal = minutoFinal + (horaFinal * 60);
		int duracaoHoras, duracaoMinutos;
		
		if (tempoInicial >= tempoFinal) {
			duracaoHoras = ((1440 - tempoInicial) + tempoFinal)/60;
		} else {
			duracaoHoras = (tempoFinal - tempoInicial)/60;
		}
		
		if (minutoInicial > minutoFinal) {
			duracaoMinutos = (60 - minutoInicial) + minutoFinal;
		} else {
			duracaoMinutos = Math.abs(minutoFinal - minutoInicial);
		}
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E "
				+ duracaoMinutos + " MINUTO(S)");
			
		scan.close();
	}
}
