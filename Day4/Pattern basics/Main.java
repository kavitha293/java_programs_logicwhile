import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = 5;// s.nextInt();
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < i; j++)  System.out.print("  ");
	        for(int j = 0; j < n-i; j++){
	            if(i == 0 || j == 0 || j == n-i-1)    System.out.print((j+1) + " ");
	            else System.out.print("  ");
	        }
	       System.out.println();
	    }
	}
}