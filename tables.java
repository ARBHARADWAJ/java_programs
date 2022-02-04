import java.util.*;
class tables{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("which table you want to see\nplease enter the number and rows:");
	int n=sc.nextInt(),r=sc.nextInt(),i;
System.out.println("The table for the "+n+"is:");
	for(i=1;i<=r;i++){
	 System.out.println(n+" * "+i+" = "+(n*i));
	}		
	
	}
}