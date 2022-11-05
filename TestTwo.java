package in.oasys;
import java.util.Scanner;
public class TestTwo {
public static void main(String[] args)
{
	int Number;
	Scanner o=new Scanner(System.in);
	System.out.println("Enter the Number=");
	Number=o.nextInt();
	System.out.println("Your Number is="+Number);
	if (Number<20)
	{
		System.out.println("The value is less than 20");
		if (Number>10)
		{
			System.out.println("The value is greaterthan 10");
		}else if(Number>=50) {
			System.out.println("Your Value is less than or equal to 50");
		}
	}else {
		System.out.println("Your value is greater than 20");
	}
	}
	}
