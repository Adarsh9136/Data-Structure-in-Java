class Stack{
    int s1[];
    int rear=0;
    int ssize;

    Stack(int size){
        ssize=size;
        s1=new int[size];
    }

    //push function
    void push(int value){
        if(rear==ssize){
        System.out.println("Stack Full -  ");
    }
        else{
            if(rear!=0){
                for(int i=rear-1;i>=0;i--){
                    s1[i+1]=s1[i];
                }
            }
            s1[0]=value;
            rear++;
            System.out.println("Item Pushed "+value+" -  ");
        }
        display();
    }

    //pop function
    void pop(){
        if(rear==0){
            System.out.println("Stack Empty,You can't pop.");
        }
        else{
            int val=s1[0];
            for(int i=0;i<rear-1;i++){
                s1[i]=s1[i+1];
            }
            rear--;
            System.out.println("Item Poped "+val+" -  ");
        }
        display();
    }

    //display function
    void display(){
        System.out.println("Stack : ");
        if(rear==0){
            System.out.println("|       |\n|       |\n|(Empty)|\n|       |\n|       |");
        }
        else{
        for(int i=0;i<rear;i++){
            System.out.println("|   "+s1[i]+"   |");
        }
        }
        System.out.println("|_______|");

    }
}
class StackUsingArray{
    public static void main(String[] args) {
        Stack s1=new Stack(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println("Contributed By Adarsh Kashyap");
    }
}