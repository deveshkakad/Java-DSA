import java.net.Socket;

public class BinaryTreeBuild{
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildBinaryTreeFromPreOrder(nodes);
        // printBinaryTree(root);
        // System.out.println();
        System.out.print("Inorder Traversal of tree is:");
        inorderTraversal(root);
        System.out.println();
    }

    static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    static void printBinaryTree(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    static int idx = -1;
    static Node buildBinaryTreeFromPreOrder(int nodes[]){
        idx++;

        if(nodes[idx] == -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildBinaryTreeFromPreOrder(nodes);
        newNode.right = buildBinaryTreeFromPreOrder(nodes);
        return newNode;
    }
}