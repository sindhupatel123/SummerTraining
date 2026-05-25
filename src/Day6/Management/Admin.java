package Day6.Management;

public class Admin {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.name = "student2";

        std1.displayDetails();
        System.out.println(std1.name);
        System.out.println(std1.department);
        System.out.println(std1.amount);
    }
}
