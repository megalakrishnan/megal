import java.util.Arrays;
import java.util.Scanner;

public class sorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int[] a=new int[b];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	          
		}
		Arrays.sort(a);
		for(int j=0;j<a.length;j++)
		{	
		System.out.println(a[j]);
		}
	}

}
