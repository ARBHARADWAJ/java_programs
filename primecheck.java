import java.util.*;
class primecheck{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
int a=s.nextInt();
int i,flag=0;
for(i=1;i<=a;i++){
if(a%i==0){
	flag++;
}
}
if(flag==2){
System.out.println("prime");
}
else{
System.out.println("not prime");
}
}
}