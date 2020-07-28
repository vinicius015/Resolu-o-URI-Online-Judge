package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int maior = (a + b + Math.abs(a - b)) / 2;
		maior = (maior + c + Math.abs(maior - c)) / 2;
		
		System.out.println(maior + " eh o maior");
		
		
		scan.close();
	}
}