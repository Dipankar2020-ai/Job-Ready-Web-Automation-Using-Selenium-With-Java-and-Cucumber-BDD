//Task 10- Write a program which will break the current execution if it find “Selenium”
//	Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]

package Assignment1;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s=new String[5];
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Strings :");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		
		for(String var:s)
		{
			if(var.equals("Selenium"))
			{
				//System.out.println("Break");
				break;
			}
		}
		
		

	}

}
