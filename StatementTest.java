package in.oasys;
import java.util.Scanner;
public class StatementTest {

	public static void main(String[] args) {
		int A;
		int B;
		Scanner O =new Scanner(System.in);
		System.out.println("Enter the Value A = ");
		A=O.nextInt();
		System.out.println("Enter the Value B = ");
		B=O.nextInt();
		if (A>B)
		{
	    System.out.println("The Value A is Greater than B");        
	}else {
		System.out.println("The Value B is Greater than A");
	}
		System.out.println("*******************************");

}}
