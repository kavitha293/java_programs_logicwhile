public class Main
{
	public static void main(String[] args) {
	    int n1=541,n2=986,s1=0,s2=0;
	    while(n1>0){
	        int a = n1%10;
	        s1 =s1*10+a;
	        n1=n1/10;
	    }
	    while(n2>0){
	        int a = n2%10;
	        s2 = s2*10+a;
	        n2=n2/10;
	    }
	    System.out.print(s1>s2? s1 :s2 );
	    System.out.print(" is largest");
	}
}
