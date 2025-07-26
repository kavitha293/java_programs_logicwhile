/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String cName = "XYZ";
	    String cId = "12345";
	    int units = 250;
	    System.out.println("Customer ID: " + cId);
	    System.out.println("Customer Name: " + cName);
	    System.out.println("Units consumed: " + units);
	    if(units <= 0)  System.out.println("Invalid");
	    else{
	        double bBill = 0.0;
    	    if(units <= 100)  bBill = units * 1.50;
    	    else if(units <= 200)    bBill = (100 * 1.50) + ((units - 100) * 2.00);
    	    else if(units <= 300)   bBill = (100 * 1.50) + (100 * 2.00) + ((units -200) * 3.00);
    	    else bBill = (100 * 1.50) + (100 * 2.00) + (100 * 3.00) + ((units - 300) * 5.00);
    	    double gst = 0.05 * bBill;
    	    double sCharge = 25.0;
    	    double discount = 0.0;
    	    if(bBill >= 500){
    	        discount = 0.05 * bBill;
    	    }
    	    double total = bBill + gst + sCharge;
    	    System.out.printf("Base bill: %.1f", bBill);
    	    System.out.printf("\nGST (5 Percent): %.1f", gst);
    	    System.out.printf("\nService Charge: %.1f\n", sCharge);
    	    System.out.println("Discount: "+ discount);
    	    System.out.printf("Total Amount: %.1f", (total - discount));
	    }
	}
}
