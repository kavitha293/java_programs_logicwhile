/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=1438;
	    while(n > 9){
	        int s = 0;
	        while(n > 0){
    	        int a = n % 10;
    	        s += a;
    	        n /= 10;
	        }
	        n = s;
	    }
	    System.out.println(n);
	    System.out.println(n == 1 ? "Magic" : "Genenric");
	}
}
