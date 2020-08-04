package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner (System.in);
		
		int golsInter, golsGremio;
		int grenais = 0;
		int vitoriasInter = 0; 
		int vitoriasGremio = 0; 
		int empates = 0;
		int continuar = 1;
		
		
		do {
			
			golsInter = scan.nextInt();
			golsGremio = scan.nextInt();
			
			if (golsInter > golsGremio) {
				vitoriasInter++;
			} else if (golsGremio > golsInter) {
				vitoriasGremio++;
			} else {
				empates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = scan.nextInt();
			
			grenais++;
			
		} while (continuar == 1);
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}
		
		scan.close();
	}
}
