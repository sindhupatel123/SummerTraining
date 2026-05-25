package Day6.Management;

public class Student {
    public String name = "student1";
    private String subject = "java";
    protected double amount = 50000;
    String department = "CSE";

    public void displayDetails(){
       System.out.println("Name: "+ name);
       System.out.println("Subject: "+ subject);
       System.out.println("Amount: "+ amount);
       System.out.println("Ddpartment: "+ department);
    }
    
}
