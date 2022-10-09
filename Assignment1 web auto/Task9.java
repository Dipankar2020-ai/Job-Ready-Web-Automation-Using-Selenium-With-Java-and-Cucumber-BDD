//Write a program which will break the current execution if it find number 85
//	Input – [12,34,66,85,900]

package Assignment1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[5];
		System.out.println("Enter the Numbers : ");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 for(int var:arr)
		 {
			 if(var==85)
			 {
				// System.out.println("Break");
				 break;
			 }
		 }

	}

}
