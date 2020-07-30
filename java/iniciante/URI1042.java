package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner (System.in);
		
		int nums[] = new int[3];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		int numsSort[] = new int[3];
		
		for (int i = 0; i < numsSort.length; i++) {
			numsSort[i] = nums[i];
		}
		
		Arrays.sort(numsSort);
		
		for (int numeros: numsSort) {
			System.out.println(numeros);
		}
		
		System.out.println();
		
		for (int numeros: nums) {
			System.out.println(numeros);
		}
		
		scan.close();
	}
}
