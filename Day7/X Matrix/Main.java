import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static boolean xMat(int n, int m, int[][] mat){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if((i == j || j == n - i - 1) && mat[i][j] == 0)
                    return false;
                else if(i != j && j != n - i - 1 && mat[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int m = s.nextInt();
	    int[][] mat = new int[n][m];
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < m; j++)
	            mat[i][j] = s.nextInt();
	    }
	    System.out.println(xMat(n, m, mat));
	}
}
