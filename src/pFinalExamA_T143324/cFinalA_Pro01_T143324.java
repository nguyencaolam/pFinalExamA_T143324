/**
 * 
 */
package pFinalExamA_T143324;

import java.util.Scanner;

/**
 * @author nguyencaolam
 *
 */
public class cFinalA_Pro01_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n, i, j;

		System.out.println("Input n: ");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++)
				if (i == 1 || i == n || j == 1 || j ==  n)
					System.out.print(" *");
				else
					System.out.print("  ");
			System.out.print("\n");
		}// end for
	}

}
