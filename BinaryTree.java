import java.util.*;
import java.util.stream.Collectors;

class Nodes {
    int data;
    Nodes left, right;

    public Nodes(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    static Scanner scan = null;

    static Nodes createTree() {
        Nodes root = null;
        System.out.println("Enter a data ");
        int data = scan.nextInt();
        if (data == -1)
            return null;

        root = new Nodes(data);
        System.out.println("Enter LEFT node of " + data);
        root.left = createTree();

        System.out.println("Enter RIGHT node of " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        createTree();
    }
}



