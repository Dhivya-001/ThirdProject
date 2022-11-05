package in.oasys;
import java.util.Scanner;
public class BasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int A= 10;
		System.out.println("Interger= "+A);
		float B=3.4f;
		System.out.println("Float= "+B);
		String C= "Dhivya ";
		C=C+"Vivek Raja";
		System.out.println("String= "+C);
		long D=10000;
		System.out.println("Long= "+D);
		Boolean E = true;
		System.out.println("Boolean= "+E);
		char F= '$';
		System.out.println("Char= "+F);
		double G = 520;
		System.out.println("Double= "+G);
		if(A>=20) { // Modulus operator - Gives remainder
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		int Z;
		Scanner dhiv =new Scanner(System.in);
		System.out.println("Enter the Value Z=");
		Z=dhiv.nextInt();
		System.out.println ("The Value is="+Z);
		
		

	}

}