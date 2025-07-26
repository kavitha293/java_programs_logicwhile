/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static int len(int n){
        int num = n;
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static boolean disarium(int n){
        int num = n;
        int l = len(n);
        int sum = 0;
        while(n > 0){
            int a = n % 10;
            sum += Math.pow(a,l--);
            n = n / 10;
        }
        if(num == sum)  return true;
        else    return false;
    }
	public static void main(String[] args) {
	    int n = 100;
	    for(int i = 0; i <= n; i++){
	        if(Main.disarium(i)){
	            System.out.println(i);
	        }
	    }
	}
}
