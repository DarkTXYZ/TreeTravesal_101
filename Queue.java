public class Queue {
    Node[] arr; // circular Queue
    int capacity;
    int front;
    int back;
    int size;

    public Queue(int cap) {
        arr = new Node[cap];
        capacity = cap;
        front = back = 0;
        size = 0;
    }

    public void enqueue(Node node) {
        if (!isFull()) {
            if(isEmpty()){
                front = back = 0;
                arr[back] = node;
            }
            else{
                arr[back] = node; 
            }
            back = (back + 1) % capacity;
            size++;

        } else {
            System.out.println("Queue Overflow!!!");
        }
    }

    public Node dequeue() {
        if (!isEmpty()) {
            Node del = arr[front];
            front = (front + 1) % capacity;
            size--;
            return del;

        } else {
            System.out.println("Queue Underflow!!!");
            return null;
        }
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (size == capacity)
            return true;
        else
            return false;
    }

    public void printCircularIndices() {
        System.out.println("Front index = " + front + " Back index = " + back);
    }

    public void printQueue() {
        if (!isEmpty()) {
            int end = (back-1)%capacity;
            if(end < 0)
                end += capacity;
            System.out.print("[Front] ");
            for(int i = front ; i != end ; i = (i+1)%capacity){
                System.out.print(arr[i].data + " ");
            }
            System.out.print(arr[end].data + " ");
            System.out.println("[Back]");
        } else {
            System.out.println("Empty Queue!!!");
        }
    }
}
