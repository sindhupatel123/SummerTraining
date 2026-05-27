package Day7;

public class ArrayException {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=10;
        }catch(Exception e){
            System.out.println("Array Index Out Of Bound Exception");
        }
    }


    