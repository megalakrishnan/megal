import java.util.Scanner;

public class holiday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		switch(s)
		{
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thrusday":
		case "Friday":
		case "Saturday":
		System.out.println("true");
		break;
		case "Sunday":
			System.out.print("false");
			break;
			default:
				System.out.println("only week day");
				
		       
		}
	}

}
