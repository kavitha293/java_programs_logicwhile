public class Main
{
	public static void main(String[] args) {
	    int n=-2012;
	    n = Math.abs(n);
	    int s=n%10;
	    n/=10;
	    int flag=1;
	    while(n>0){
	        int a = n%10;
	        n/=10;
	        if(Math.abs(s-a)==1){
	            s=a;
	        }
	        else{
	            flag=0;
	            break;
	        }
	    }
	    System.out.println(flag==1 ? "jumping number":"not");
	}
}
