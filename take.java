import java.util.*;
class take{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i=1,j=0,k,sum=0;
		Vector<Integer> vec=new Vector<Integer>();
		System.out.println("Enter the digits\nTo end type '0' for ending loop");
	    while(i>0){
			k=s.nextInt();
			if(k==0){
				break;}
			else{
				sum+=k;
				vec.add(k);
				j++;	
			}
	}
		System.out.println(vec);
		System.out.println("printing their sum is:"+sum);
	}
}	