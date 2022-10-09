package Assignment1;

import java.util.Scanner;

class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("Before Swapping values of a and b are %d,%d",a,b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("After Swapping values of a and b are %d,%d",a,b);
		
		

	}

}
