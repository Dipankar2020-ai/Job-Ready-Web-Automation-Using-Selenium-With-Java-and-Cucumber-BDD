/******************************************************************************
Task 2- Extension of task 1 – Store all trainer information in Array.

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
		Trainer[] obj = new Trainer[3] ;
 
     obj[0] = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
     obj[1] = new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
     obj[2]=new Trainer("Mukesh","Devops","mukesh@gmail.com",3);
     //System.out.print(obj[1].department);
	}
}
