/******************************************************************************
Task 1- Create a class name as “Trainer” which will have 4 fields name, department ,  email, id. Trainer can teach Selenium, DevOps, Web Development.
Note- use method, constructor 

*******************************************************************************/
class Trainer
{
    String name;
    String department;
    String email;
    int id;
    Trainer(String name,String department,String email,int id)
    {
        this.name=name;
        this.department=department;
        this.email=email;
        this.id=id;
    }
    public void selenium()
    {
        System.out.print("Trainer 1 can teach Selenium,");
    }
    public void WebDev()
    {
        System.out.print("Trainer 2 can teach Web Development,");
    }
    public void DevOps()
    {
        System.out.print("Trainer 3 can teach Devops.");
    }
   
    
}


public class Main
{
	public static void main(String[] args) {
	
     Trainer t1=new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
     Trainer t2=new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
     Trainer t3=new Trainer("Mukesh","DevOps","mukesh@gmail.com",3);
     t1.selenium();
     t2.WebDev();
     t3.DevOps();
     
   
	}
}
