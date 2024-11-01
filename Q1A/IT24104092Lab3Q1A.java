import java.util.Scanner;

public class IT24104092Lab3Q1A {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		double priceperkg;
		double weight;
		double Total;

		System.out.println("Enter the price of 1kg of rice:");
		priceperkg=input.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy:");
		weight=input.nextDouble();

		Total=(weight*priceperkg);

		System.out.println("Total amount"+Total);
	}
}	