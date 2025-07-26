import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int m = s.nextInt();
	    int[][] mat = new int[n][m];
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < m; j++)
	            mat[i][j] = s.nextInt();
	    }
	    for(int i = 0; i < n; i++){
	        for(int j = m-1; j >= 0; j--)
	            System.out.print((mat[i][j]^1) + " ");
	        System.out.println();
	    }
	}
}
