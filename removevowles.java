import java.util.Scanner;

public class reversevowlses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=new StringBuffer(s).reverse().toString();
		System.out.println(s1);
		String s3=s1.replace("a","");
		s3=s3.replace("e","");
		s3=s3.replace("i", "");
		s3=s3.replace("o","");
		s3=s3.replace("u","");
		s3=s3.replace("A", "");
		s3=s3.replace("E","");
		s3=s3.replace("I","");
		s3=s3.replace("O","");
		s3=s3.replace("U","");
		System.out.println(s3);
		

	}

	

}
