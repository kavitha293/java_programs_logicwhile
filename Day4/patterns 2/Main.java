/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    /*
	    int k = 0;
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j <= i; j++)
	            System.out.print((char)('A' + k++) + " ");
	       System.out.println();
	    }
	    */
	    /*
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n-i-1; j++)  System.out.print("  ");
	        for(int j = 1; j <= 2*i+1; j++) System.out.print("* ");
	        System.out.println();
	    }
	    int k = 0;
	    */
	    int k = (n/2)+1;
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            System.out.print((i == j || j == n-i-1) ? k + " " :"  ");
	        }
	        System.out.println();
	        if(i < (n/2)) k--;
	        else k++;
	    }
	}
}
