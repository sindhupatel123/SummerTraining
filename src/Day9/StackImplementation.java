package Day9;

public class StackImplementation {
int arr[]=new int[5];
int top=-1;
void isFull(){
    if(top==arr.length-1)
    {
        System.out.println("stack OverFlow");
    }
}
void push(int data)
{
    if(top==arr.length-1)
    {
        System.out.println("stack OverFlow");
    }
    else
    {
        top++;
        arr[top]=data;
        System.out.println("Pushed "+data);
    }
}
        void pop() {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top]+"->deleted");
        top--;
        arr[top]=0;
    }
    void peek(){
        if(top==-1)
        {
            System.out.println("No value in stack");
            return;
        }
        System.out.println(arr[top]+"-> is peek element");
    }
    boolean search(int data)
    {
        if(top==-1)
        {
       return false;
        }
        for(int i=0;i<top;i++)
        {
            if(arr[i]==data)
        return true;
        }
        return false;
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("No elements in stck");
                return;
        }
        for(int i=top;i>0;i--)
        {
            System.out.print(arr[i]+"->");
        }

        }
        void count(){
            if(top==-1){
                System.out.println("No elememnts in stack");
                return;
            }
            int c=0;
            for(int i=top;i>0;i--)
            {
                c++;
            }
            System.out.println(c);
        }


    public static void main(String[] args) {
        StackImplementation ob = new StackImplementation();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        ob.push(60);
        // ob.pop();
        // ob.peek();
        // System.out.println(ob.search(20));
        // ob.display();
        ob.count();
    }

    
}
