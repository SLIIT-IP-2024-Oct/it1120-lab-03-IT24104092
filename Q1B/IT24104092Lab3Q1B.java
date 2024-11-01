import java.util.Scanner;

public class IT24104092Lab3Q1B {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		double priceperkg;
		double weight;
		double Total;
		double total;

		System.out.println("Enter the price of 1kg of rice:");
		priceperkg=input.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy:");
		weight=input.nextDouble();

		Total=(weight*priceperkg);
		total=(Total*0.9);
		

		System.out.println("Total amount with 10% discount is"+total);
	}
}