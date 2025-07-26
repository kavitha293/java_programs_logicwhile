/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // int n = s.nextInt();
	    int[] a = {7, 5, 3, 1 , 6, 4};
	    int min = Integer.MAX_VALUE;
	    int maxProfit = 0;
	    for(int i = 0; i < 6; i++){
	        if(a[i] < min)
	            min = a[i];
	        else if(a[i] - min > maxProfit)
	            maxProfit = a[i] - min;
	    }
	    System.out.print(maxProfit);
	}
}
