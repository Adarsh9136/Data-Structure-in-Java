class Stack{
    //create a node class
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;     //head
    Node tail=null;     //tail

    //push function
    void push(int data){
        Node new_node=new Node(data);
        if(head==null){                 //Empty Case
            head=new_node;          
            tail=new_node;
        }
        else{                           //Elements are present in stack
            new_node.next=head;
            head=new_node;
        }
        System.out.println("\nPushed data - "+data+" - ");
        display();
    }

    //pop function
    void pop(){
        if(head==null){                 //Empty case
            System.out.println("\nEmpty, You Can't Pop.");
        }
        else if(head==tail){            //only one element in stack
            int value=head.data;
            head=tail=null;
            System.out.println("\nPoped data - "+value+" - ");
        }
        else{                           //more than one element are in stack
            int value=head.data;
            head=head.next;
            System.out.println("\nPoped data - "+value+" - ");
        }
        display();
    }
    //display function
    void display(){

        System.out.println("Stack : ");
        if(head==null){
            System.out.println("|       |\n|       |\n|(Empty)|\n|       |\n|       |");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println("|   "+temp.data+"   |");
                temp=temp.next;
            }
        }
        System.out.println("|_______|");
    }
}
class StackUsingLinkedList{
    public static void main(String[] args) {

        Stack s1=new Stack();
        s1.pop();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println("Contributed By Adarsh Kashyap");
    }
}