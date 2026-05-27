package Day7;

public class DivisionException {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch(Exception e){
            System.out.println("Division by zero is not allowed");
        }
    }
    
}
