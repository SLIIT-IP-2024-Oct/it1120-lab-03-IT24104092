import java.util.Scanner;

public class IT24104092Lab3Q3 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=input.nextInt();

		int n5000,n1000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
		
		n5000=amount/5000;
		amount=amount%5000;
		System.out.println("5000 Notes - "+n5000);

		n1000=amount/1000;
		amount=amount%1000;
		System.out.println("1000 Notes - "+n1000);

		n500=amount/500;
		amount=amount%500;
		System.out.println("500 Notes - "+n500);

                n200=amount/200;
		amount=amount%200;
		System.out.println("200 Notes - "+n200);

		n100=amount/100;
		amount=amount%100;
		System.out.println("100 Notes - "+n100);

		n50=amount/50;
		amount=amount%50;
		System.out.println("50 Notes - "+n50);

		n20=amount/20;
		amount=amount%20;
		System.out.println("20 Notes - "+n20);


		n10=amount/10;
		amount=amount%10;
		System.out.println("10 Notes - "+n10);


		n5=amount/5;
		amount=amount%5;
		System.out.println("5 Notes - "+n5);


		n2=amount/2;
		amount=amount%2;
		System.out.println("2 Notes - "+n2);

		n1=amount/1;
		amount=amount%1;
		System.out.println("1 Notes - "+n1);


	}
}


		