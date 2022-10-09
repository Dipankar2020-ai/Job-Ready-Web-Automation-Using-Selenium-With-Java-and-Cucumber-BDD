//Task 6- Write a program to print all prime numbers from 1-1000
package Assignment1;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing all prime numbers from 1-1000 :");
		for(int i=1;i<=1000;i++)
		{  
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.print(i+" ");
			}
		
		}
		

	}

}
