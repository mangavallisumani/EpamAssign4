package assign4;
import java.util.Scanner;
public class SimpleCompound {	
	public static void main(String[] args) {
		SCIntrest obj = new SCIntrest();
		Scanner sc=new Scanner(System.in);
		double p,t,r;
		System.out.println("Enter the amount");
		p=sc.nextDouble();
		System.out.println("Enter the time:");
		t=sc.nextDouble();
		System.out.println("Enter the Intrest");
		r=sc.nextDouble();
		System.out.println("Simple intrest" +obj.SimpleIntrest(p,t,r));
		System.out.println("Compound intrest"+obj.CompoundIntrest(p,t,r));
	}
}