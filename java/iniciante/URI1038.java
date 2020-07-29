package iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI1038 {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		Map<Integer, Double> lanches = new HashMap<>();
		
		lanches.put(1, 4.00);
		lanches.put(2, 4.50);
		lanches.put(3, 5.00);
		lanches.put(4, 2.00);
		lanches.put(5, 1.50);
		
		int codigo = scan.nextInt();
		int quant = scan.nextInt();
		
		System.out.printf("Total: R$ %.2f" + (lanches.get(codigo) * quant));
		System.out.println();
		
		scan.close();
	}
}
