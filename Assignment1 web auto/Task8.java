//Task 8- Write a program to print below students marks who have scored above 80
//	Example- 88,12,89,55,35
//	Output-  88,89

package Assignment1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[5];
		System.out.println("Enter the students marks : ");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int ans[]= new int[5];
		 int k=0;
		 for(int var:arr)
		 {
			 if(var>80)
			 {
				ans[k]=var;
				k++;
			 }
		 }
		 for(int i=0;i<k;i++)
		 {
			 if(i==k-1)
			 {
				 System.out.print(ans[i]);
			 }
			 else
			 {
				 System.out.print(ans[i]+",");
			 }
		 }

	}

}
