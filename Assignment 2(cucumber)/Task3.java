/******************************************************************************
Task 3 – Create a program which will store students information and print the output.
Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
Once all entries are done, program should ask which user information you want to fetch and should print the same.
Note- Use scanner class for dynamic students

*******************************************************************************/
import java.util.*;
class Student
{
    String name;

    String email;
    int phone;
    String address;
    String status;
    Student(String name,String email,int phone,String address, String status)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.status=status;
        
    }
   
  
}


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter number of student ");
	    int n=sc.nextInt();
	   	sc.nextLine();
    	Student[] obj = new Student[n] ;
    	if(n<=0)
    	{
    	    System.out.println("Please enter at least 1 student data ");
    	    System.exit(0);
    	}
    	
	
		for(int i=0;i<n;i++)
		{
		    System.out.println("Please enter your name : ");
		    String name=sc.nextLine();
		    System.out.println("Please enter your email : ");
		    String email=sc.next();
		    System.out.println("Please enter your Phone number : ");
		    int phone=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Please enter your Address : ");
		    String address=sc.nextLine();
		    System.out.println("Please enter your status : ");
		    String status=sc.nextLine();
		    obj[i]=new Student(name,email,phone,address,status);
		    
		    
		}
		System.out.println("Please enter which student details are you looking for ");
		int data=sc.nextInt();
		if(data==n)
		{
		    System.out.println("Please enter less than of present value for student data fetch");
		    System.exit(0);
		}
		System.out.println(obj[data].name);
		System.out.println(obj[data].email);
		System.out.println(obj[data].phone);
		System.out.println(obj[data].address);
		System.out.println(obj[data].status);
		
		
 
     
	}
}
