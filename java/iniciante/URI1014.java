package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int kmPercorridos = scan.nextInt();
		double combustivelGasto = scan.nextDouble();
		
		double litrosPorKm = kmPercorridos / combustivelGasto;
		
		System.out.printf("%.3f km/l", litrosPorKm);
		
		scan.close();
	}
}