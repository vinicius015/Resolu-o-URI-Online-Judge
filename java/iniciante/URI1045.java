package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double X;
		
		if (B > A && B > C) {
			X = A;
			A = B;
			B = X;
		} else if (C > A) {
			X = A;
			A = C;
			C = X;
		}
		
		if (A >= (B + C)) { 
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
			if (A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
			if (A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) 
				System.out.println("TRIANGULO ISOSCELES");
		}
		
		scan.close();
	}
}
