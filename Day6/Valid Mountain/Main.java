import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++)
	        arr[i] = sc.nextInt();
	    int i = 0, cnt = 0;
	    if(n >= 3){
	        
    	    while(arr[i+1] > arr[i]){
    	        cnt++;
    	        i++;
    	    }
    	    while(i < n - 1 && arr[i+1] < arr[i]){
    	        cnt++;
    	        i++;
    	    }
    	    if(i == n - 1 && cnt == n-1)
    	        System.out.println("True");
    	    else
    	        System.out.println("False");
	    }
	    else
	        System.out.println("False");
	}
}
