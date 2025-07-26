/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void shiftZeroes(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++)
            if(arr[i] == 0)
                System.out.print(0 + " ");
        for(int i = 0; i < len; i++)
            if(arr[i] != 0)
                System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
            //arr[i] = arr[i] % 2;
        }
        shiftZeroes(arr);
        
	}
}