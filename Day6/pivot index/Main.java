/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {1, 7, 3, 6, 5 , 6};
	    int total = 0;
	    for(int val : a)    total += val;
	    int leftSum = 0;
	    for(int i = 0; i < a.length; i++){
	        if(leftSum == total - leftSum - a[i]){
	            System.out.print(i);
	            break;
	        }
	        leftSum += a[i];
	        
	    }
	}
}
