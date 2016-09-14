import java.util.Scanner;

public class stringinteger {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
for(int i=2;i<a;i++)
	{
	boolean isprimenumber=true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0){
		isprimenumber=false;
		break;
	}}
	if(isprimenumber){
	count++;
	System.out.print(i+",");
		}
	}
System.out.println(+count);
	}

}
