import java.util.*;
public class sumofneg{
public static void main(String args[]){
	int a,i,sum=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(i=1;i<=a;i++)
	{
		if(i%2==0){
			sum=sum+i;
			}
		else{
			sum=sum+(i*(-1));
			}
	}
	//-1+2-3
	System.out.print(sum);
}}