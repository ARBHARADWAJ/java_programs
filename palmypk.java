import mypack.*;
import java.util.*;
class palmypk{
	public static void main(String args[]){
	 a mys=new a();		   
	 Scanner sec=new Scanner(System.in);
     System.out.println("Enter the bnumber to check whether it s palindrome or not");
     int n=sec.nextInt();
	 int ss=mys.Palindrome(n);
	 if(ss==1){
		System.out.println("It is palindrome");
	 }
     else{
       System.out.println("It is not palindrome");		 
	}
	}
}	