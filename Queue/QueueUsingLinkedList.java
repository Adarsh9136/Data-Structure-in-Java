class Queue{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    Node head=null;
    Node tail=null;
    
    void enqueue(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            tail.next=new_node;
            tail=new_node;
        }
        System.out.print("Enqueue data- "+data+" - ");
        display();
    }
    
    void dequeue(){
        if(head==null){
            System.out.print("Queue is empty, so can't perform Dequeue. ");
        }
        else {
            int value=head.data;
            if(head.next==null){
            head=tail=null;
        }
        else{
            head=head.next;
        }
    
        System.out.print("Dequeue data- "+value+" - ");
    }
        display();
    }
    void display(){
        Node temp=head;
        System.out.print("Queue: ");
        if(temp!=null){
            while(temp!=null){
                System.out.print("  "+temp.data);
                temp=temp.next;
            }
        }
        else{
            System.out.print("Empty Queue.");
        }
        System.out.println();
    }
}
class QueueUsingLinkedList{
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.display();
        q1.enqueue(15);
        q1.enqueue(10);
        q1.enqueue(15);
        q1.enqueue(75);
        q1.enqueue(12);
        q1.enqueue(13);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        System.out.println("Contributed By Adarsh Kashyap");
        
    }
}