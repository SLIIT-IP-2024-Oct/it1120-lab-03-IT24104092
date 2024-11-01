import java.util.Scanner;

public class IT24104092Lab3Q2 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		double otamount;
		double othourlyrate;
		double monthlysalary;
		double othours;
		double totalsalary;

		System.out.println("Enter the monthly salary:");
		monthlysalary=input.nextDouble();
		
		System.out.println("Enter the number of OT hours:");
		othours=input.nextDouble();

                System.out.println("Enter OT hourly rate:");
		othourlyrate=input.nextDouble();

		otamount=(othours*othourlyrate);
		totalsalary=(monthlysalary+otamount);
		

		System.out.println("The total salary including OT is"+totalsalary);
	}
}