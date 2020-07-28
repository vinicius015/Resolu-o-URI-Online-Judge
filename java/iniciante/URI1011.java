package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1011 {
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner (System.in);
		double raio = scan.nextDouble();
		double pi = 3.14159;
		
		double volume = (4.0/3 * pi * Math.pow(raio, 3));
		System.out.printf("VOLUME = %.3f", volume);
		System.out.println();
		
		
		
		scan.close();
	}
}

