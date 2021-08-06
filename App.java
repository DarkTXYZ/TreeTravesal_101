public class App {
    public static void main(String[] args) {
        Node tree = constructTree1();
        tree.printTree();
        tree.printBFT();
        tree.printDFT();
    }

    public static Node constructTree1() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        three.left = seven;
        three.right = five;
        seven.left = two;
        seven.right = six;
        six.left = one;
        six.right = eight;
        five.right = nine;
        nine.left = four;

        return three;
    }

    public static Node constructTree2() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        five.left = seven;
        five.right = eight;
        eight.right = ten;
        three.right = six;
        six.left = nine;

        return one;
    }
}
