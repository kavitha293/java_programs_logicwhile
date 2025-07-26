import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), num = 0;
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	        num = num * 10 + arr[i];
	    }
	    num += 1;
	    int len = Integer.toString(num).length();
	    arr = new int[len];
	    
	    for(int i = len-1; i >= 0; i--){
	        arr[i] = num % 10;
	        num /= 10;
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
