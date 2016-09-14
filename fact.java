
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		int i=1;
		while(i<=a)
		{
			b*=i;
			i++;
		}
		System.out.println(b);
	}

}
