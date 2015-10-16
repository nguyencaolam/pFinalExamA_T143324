/**
 * 
 */
package pFinalExamA_T143324;

import java.util.Scanner;

/**
 * @author nguyencaolam
 *
 */
public class ss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,num=1 ,y,i;
		Scanner reader= new Scanner(System.in);
		System.out.println("Nhap x : ");
		x=reader.nextInt();
		//calculate
		
			for(;x>=1;x--){
				num=num*x;
			
			}
		
		System.out.print(" Tong chuoi la : "+ num);
	}

}
