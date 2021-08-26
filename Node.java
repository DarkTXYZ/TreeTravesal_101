public class Node extends BTreePrinter { // สืบทอด class มาจาก BTreePrinter

    Node left;
    Node right;
    int data;

    public Node(int data) { // Constructor ของ Node
        left = right = null;
        this.data = data;
    }

    public void printTree() { // เรียก function จาก BTreePrinter
        super.printTree(this);
    }

    public void printBFT() { // TreeTraversal แบบ BFT โดย code ตาม psedocode ในสไลด์
        Queue q = new Queue(50);
        q.enqueue(left);
        q.enqueue(right);
        System.out.print("BFT node sequence [ " + data + " ");

        while(!q.isEmpty()){
            Node front = q.dequeue();
            System.out.print(front.data + " ");
            if(front.left != null)
                q.enqueue(front.left);
            if(front.right != null)
                q.enqueue(front.right);
        }

        System.out.println("]");
    }

    public void printDFT() { // TreeTraversal แบบ DFT-Preorder โดย code ตาม psedocode ในสไลด์
        Stack s = new Stack(50);
        s.push(right);
        s.push(left);
        System.out.print("DFT node sequence [ " + data + " ");

        while(!s.isEmpty()){
            Node top = s.pop();
            System.out.print(top.data + " ");
            if(top.right != null)
                s.push(top.right);
            if(top.left != null)
                s.push(top.left);
        }
        
        System.out.println("]");
    }
}
