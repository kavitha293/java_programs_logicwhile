import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int size = s.nextInt();
	    int[] arr = new int[size];
	    for(int i = 0; i < size; i++)
	        arr[i] = s.nextInt();
	    for(int i = 0; i < size-1; i += 4){
	        int temp = arr[i];
	        arr[i] = arr[i+1];
	        arr[i+1] = temp;
	    }
	    for(int val : arr)
	        System.out.print(val + " ");
	}
}
