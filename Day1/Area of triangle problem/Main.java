
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
	    try {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int a = Integer.parseInt(br.readLine());
	        int b = Integer.parseInt(br.readLine());
	        int c = Integer.parseInt(br.readLine());
	        int s = (a+b+c)/2;
	        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	    }catch(Exception e) {
	        System.out.println("Something Went wrong");
	    }
	    
	}
}
