/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		long n=3,c=0;
		long i = 1;
		while (i > 0) {
		    long s = 0;
			for(long j =1; j<i; j++) {
				if(i%j==0) {
					s=s+j;
				}
			}
			if(s == i) { 
			    c++;
			    if(c == n){
			        System.out.println(i);
			        break;
			 }
			    
			}   
			
			i++;
		}
	}


}
