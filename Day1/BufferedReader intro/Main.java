
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) {
	    try{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int roll = Integer.parseInt(br.readLine());
		double cgpa = Double.parseDouble(br.readLine());
		System.out.println(name);
		System.out.println(roll);
		System.out.println(cgpa);
	    }
		catch(Exception e){
		    System.out.println(e);
		}
	}
}
