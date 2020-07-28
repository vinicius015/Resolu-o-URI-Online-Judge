package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int diferenca = (a*b) - (c*d);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		System.out.println();
		
		scan.close();
	}
}
