public class Stack {
    Node[] arr;
    int capacity;
    int size;

    public Stack(int cap){
        arr = new Node[cap];
        capacity = cap;
        size = 0;
    }
    
    public void push(Node node){

        // ใช้หลักการเดียวกับ pushBack ของ Dynamic Array

        if (!isFull()){
            arr[size] = node;
            size++;
        }else{
            System.out.println("Stack Overflow!!!");
        }
    }
    public Node pop(){

        // ใช้หลักการเดียวกับ popBack ของ Dynamic Array

        if (!isEmpty()){
            size--;
            return arr[size];
        }else{
            System.out.println("Stack Underflow!!!");
            return null;
        }
    }

    // isFull , isEmpty ใช้หลักการเดียวกับของ Dynamic Array

    public boolean isFull(){
        if(size == capacity)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    
    public void printStack(){
        if (!isEmpty()) {
            System.out.print("[Bottom] ");
            for(int i = 0 ; i < size ; ++i)
                System.out.print(arr[i].data + " ");
            System.out.println("[Top]");
        } else {
            System.out.println("Empty Stack!!!");
        }
    }
}
