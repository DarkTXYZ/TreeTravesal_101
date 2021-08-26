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

        // วิธีการคือ จะเพิ่มข้อมูลตรงตำแหน่ง back จากนั้นจึง back++
        // และ size++ เพราะมีจำนวนข้อมูลเพิ่ม

        if (!isFull()) {
            if (isEmpty()) {
                front = back = 0;
                arr[back] = node;
            } else {
                arr[back] = node;
            }
            back = back + 1;
            if (back >= capacity)
                back = 0;
            size++;

        } else {
            System.out.println("Queue Overflow!!!");
        }
    }

    public Node dequeue() {

        // วิธีการคือ จะลบข้อมูลตรงตำแหน่ง front จากนั้นจึง front++
        // และ size-- เพราะมีจำนวนข้อมูลลด

        if (!isEmpty()) {
            Node del = arr[front];
            front = front + 1;
            if (front >= capacity)
                front = 0;
            size--;
            return del;

        } else {
            System.out.println("Queue Underflow!!!");
            return null;
        }
    }

    public boolean isEmpty() {

        // เช็คว่า queue ว่างหรือเปล่า โดยเช็คจาก size

        if (size == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {

        // เช็คว่า queue เต็มหรือเปล่า โดยเช็คจาก size เทียบกับ capacity

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
            if (front == back) {

                // ถ้า front == back นั่นคือทั้ง array นั่นเอง โดยเริ่ม print จาก ตำแหน่ง front ก่อน

                System.out.print("[Front] ");
                for (int i = front; i < capacity; ++i) {
                    System.out.print(arr[i].data + " ");
                }
                for (int i = 0; i < back; ++i) {
                    System.out.print(arr[i].data + " ");
                }
                System.out.println("[Back]");
            } else {

                // ถ้าไม่ ก็ไล่ array ตั้งแต่ front ไปเรื่อยๆ จนกว่าจะถึงตำแหน่ง back 
                // โดยหากไล่ไปแล้วเกิน capacity ก็ให้ set กลับไปที่ตำแหน่งเริ่มต้น

                System.out.print("[Front] ");
                for (int i = front; i != back; ++i) {
                    if (i == capacity) {
                        i = -1;
                        continue;
                    }
                    System.out.print(arr[i].data + " ");
                }
                System.out.println("[Back]");
            }
        } else {
            System.out.println("Empty Queue!!!");
        }
    }
}
