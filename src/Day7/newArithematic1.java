package Day7;

public class newArithematic1 {
    
    public static void main(String[] args) {
        int n=19;
        try{
            if(n>18){
                throw new ArithmeticException("> 18");
            }
        }catch(ArithmeticException e)
        {
            System.out.println("eligible");
        }
        System.out.println("not eligible");
    }
     
}

    
