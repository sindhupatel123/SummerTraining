package Day7;

public class ArithematicException {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch(Exception e){
            System.out.println("Arithematic Exception");
        }
    }
}