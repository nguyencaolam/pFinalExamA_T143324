/**
 * 
 */
package pFinalExamA_T143324;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author nguyencaolam
 *
 */
public class cFinalA_Pro05_T143324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String file="/Users/nguyencaolam/Documents/workspace/tho.txt";
int a=0 ;
int[] b=new int[1000];
int m,n,i,num=0,sum1=0,sum2=0,max1=0,min2=0 ;
try {
	Scanner reader =new Scanner(new File(file));
	while(reader.hasNextInt()){
		b[num]=reader.nextInt();
		num=num+1;
	}
	reader.close();
	for(i=0;i<num;i++){
		//System.out.print(" "+b[i]);
		if(b[i]>0){
			//System.out.print(" "+b[i]);
			sum1=sum1+b[i];
			max1=Math.max(max1,b[i]);
		}
		
		if(b[i]<0){
			//System.out.println(" "+b[i]);
			sum2=sum2+b[i];
			min2=Math.min(min2, b[i]);
		}

	}
	System.out.println();
	System.out.print(" Tong cac so duong : "+sum1);
	System.out.println();
	System.out.print(" Tong cac so am : "+sum2);
	System.out.println();
	System.out.print(" So duong lon nhat : "+max1);
	System.out.println();
	System.out.print(" So am nho nhat : "+min2);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
