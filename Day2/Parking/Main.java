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
        System.out.println("Input:");
        int n = s.nextInt();
        s.close();
        int total = 0;
        if (n > 0) {
            total += 50;
            n = n - 2;
            if (n > 0)
                total += n * 20;
        }
        System.out.println(total);
	}
}
