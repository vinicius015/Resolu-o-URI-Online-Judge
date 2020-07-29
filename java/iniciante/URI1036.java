package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1036 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);

		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			double x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);

			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f", x2);
			System.out.println();
		}
		scan.close();
	}
}
