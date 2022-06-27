class QueueUsing{
    static int q1[];
    int front=0,rear=0;
    int capacity;
    QueueUsing(int size){
        capacity=size;
        q1=new int[size];
    }
    void enqueue(int value){
        if(rear==capacity){
            System.out.println("Queue is already Full");
        }
        else{
            q1[rear]=value;
            rear++;
            System.out.println("Enqueue data is "+value);
        }
        display();
    }
    void dequeue(){
        if(rear==front){
            System.out.println("Stack is already Empty");
        }
        else{
            System.out.println("Dequeue data is "+q1[rear-1]);
            rear--;
        }
        display();
    }
    void display(){
        if(rear==0){
            System.out.println("---------------------------");
            System.out.print("       (Empty Queue)         ");
            System.out.println("\n---------------------------\n");
        }
        else{
            System.out.println("---------------------------");
            for(int i=0;i<rear;i++){
                System.out.print("| "+q1[i]+" |");
            }
            System.out.println("\n---------------------------\n");
        }
    }
}
class QueueUsingArray{
    public static void main(String[] args) {
        QueueUsing q1=new QueueUsing(5);
        q1.dequeue();
        q1.enqueue(5);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(9);

        q1.dequeue();
        System.out.println("Contributed By Adarsh Kashyap");
    }
}