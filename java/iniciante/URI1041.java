package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1041 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} 
		
		scan.close();
	}
}
