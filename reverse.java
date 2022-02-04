import java.util.*;
class reverse{
public static void main(String args[]){
int n,d,rev=0;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0){
	d=n%10;
	rev=rev*10+d;
	n=n/10;
}
System.out.println("The reverse of the number is :"+rev);
}
}
