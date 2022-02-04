import java.util.*;
class sumofseries{
	public static void main(String args[]){
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
