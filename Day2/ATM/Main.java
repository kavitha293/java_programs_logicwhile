

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        int n = s.nextInt();
        s.close();
        int[] notes = { 500, 200, 100 };
        int[] noOfnotes = new int[3];
        if (n > 0 && n % 100 == 0) {
            noOfnotes[0] = n / 500;
            n = n % 500;
            noOfnotes[1] = n / 200;
            n = n % 200;
            noOfnotes[2] = n / 100;
        } else
            System.out.println("Invalid");
        int i = 0;
        while (noOfnotes[i] != 0) {
            System.out.println(notes[i] + " notes are: " + noOfnotes[i]);
            i++;
        }
	}
}
