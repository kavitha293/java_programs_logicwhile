/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Create Account");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposite");
		System.out.println("4. View balance");
		System.out.println("5. Exit");
		int ch = sc.nextInt();
		int totalBalance = 0;
		String name, phone, aadhar;
		while(true){
    		switch(choice) {
    		case 1:
    			System.out.print("Enter your name:");
    			name = sc.next();
    			System.out.print("Enter your mobile:");
    			phone = sc.next();
    			System.out.print("Enter your Aadhar Number:");
    			aadhar = sc.next();
    			System.out.println("Account created Successfull");
    			break;
    		case 2:
                System.out.print("Please Enter an amount to withdraw:");
                int amount = s.nextInt();
                if(amount > totalBalance)   System.out.println("Insufficient Balance");
                else{
                    totalBalance -= amount;
                    System.out.println("Transactin Successfull");
                }
                break;
            case 3:
                System.out.print("Please Enter an amount to deposite:");
                int amount = sc.nextInt();
                totalBalance += amount;
                System.out.println("Transactin Successfull");
    		}
		}
	}
}
