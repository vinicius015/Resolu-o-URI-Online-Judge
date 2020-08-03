package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		double[] valores = new double[6];
		int positivos = 0;

		for (int i = 0; i < valores.length; i++) {

			valores[i] = scan.nextDouble();
			if (valores[i] > 0) {
				positivos++;
			}
		}
		
		System.out.println(positivos + " valores positivos");

		scan.close();

	}
}
