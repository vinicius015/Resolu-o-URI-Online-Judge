package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		double ladoA = scan.nextDouble();
		double ladoB = scan.nextDouble();
		double ladoC = scan.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		boolean triangulo = (Math.abs(ladoB - ladoC) < ladoA && ladoA < ladoB + ladoC)
							&&
							(Math.abs(ladoA - ladoC) < ladoB && ladoB < ladoA + ladoC)
							&&
							(Math.abs(ladoA - ladoB) < ladoC && ladoC < ladoA + ladoB);
		
		if (triangulo) {
			double perimetro = ladoA + ladoB + ladoC;
			System.out.println("Perimetro = " + df.format(perimetro));
		} else {
			double areaTrapezio = ((ladoA + ladoB) * ladoC) / 2; 
			System.out.println("Area = " + df.format(areaTrapezio));
		}
		scan.close();
	}
}
