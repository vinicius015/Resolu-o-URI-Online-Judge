package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		scan.close();
	}
}
