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
	    int n = s.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	        a[i] = s.nextInt();
	    int m = s.nextInt();
	    int[] b = new int[m];
	    for(int i = 0; i < m; i++)
	        b[i] = s.nextInt();
	    a = Arrays.copyOf(a, n+m);
	    for(int i = 0; i < m; i++)
	        a[n+i] = b[i];
	    Arrays.sort(a);
	    System.out.println(Arrays.toString(a));
	}
}
