/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   int n1=1184,n2=1210,sum1=0,sum2=0;
	   for(int i=1;i<n1;i++){
	       if(n1%i==0){
	           sum1 = sum1+i;
	       }
	   }
	   for(int i=1;i<n2;i++){
	       if(n2%i==0){
	           sum2 = sum2+i;
	       }
	   }
	   if(sum1==n2 && sum2 ==n1){
        System.out.println("it is an amicable pair"); 
	   }
	   else System.out.println("not");
	}
}
