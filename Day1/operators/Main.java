

public class Main
{
	public static void main(String[] args) {
	    int a = 2;
	    int b = 3;
	    int c = 1;
	   // System.out.println(a);
	   // a +=5;
	   // System.out.println(a);
	   // a-=3;
	   // System.out.println(a);
	   // a *= 7;
	   // System.out.println(a);
	   // a /=2;
	   // System.out.println(a);
	   // a %= 23;
	   // System.out.println(a);
	   //System.out.println(a++);
	   //System.out.println(++a);
	   System.out.println(a % 2 == 0 ? "Even" : "odd");
	   System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
	}
}
