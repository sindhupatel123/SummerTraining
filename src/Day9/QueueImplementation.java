package Day9;

public class QueueImplementation {
    int arr[]=new int[5];
    int front=-1;
    int rear=-1;
    // void isFull(int data){
    //     if(rear==arr.length-1)
    //     {
    //         System.out.println("Queue OverFlow");
    //         return;
    //     }
    //     if(front==-1)
        
    //     {
    //         front=0;
    //         }
    //         rear++;
    //         arr[rear]=data;
    //         System.out.println("Queue is Empty");
    //         return;
    //     }
    // }


    void enqueue(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue OverFlow");
        }
        else
        {
            rear++;
            arr[rear]=data;
            System.out.println("Enqueued "+data);
        }
    }
    void dequeue() {
        if(front==rear)
        {
            System.out.println("Queue Underflow");
            return;
        }
        front++;
        System.out.println(arr[front]+"->deleted");
        arr[front]=0;
    }
    void peek(){
        if(front==rear)
        {
            System.out.println("No value in Queue");
            return;
        }
        System.out.println(arr[front+1]+"-> is peek element");
    }
    boolean search(int data)
    {
        if(front==rear)
        {
       return false;
        }
        for(int i=front+1;i<=rear;i++)
        {
            if(arr[i]==data)
                return true;
        }
        return false;
    }
    void display()
    {
        if(front==rear)
        {
            System.out.println("No elements in Queue");
            return;
        }
        for(int i=front+1;i<=rear;i++)
            System.out.print(arr[i]+" ");
        
    }
    public static void main(String[] args) {
        QueueImplementation ob = new QueueImplementation();
        // ob.enqueue(67);
        // ob.enqueue(789);
        // ob.enqueue(178);
        ob.dequeue();
        ob.dequeue();
        // ob.peek();
        // ob.display();


    }
}


    

