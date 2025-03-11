import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LeftViewOfBinaryTree {
    static int maxLevel = 0;
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            ArrayList<Integer> result = leftView(root);
            if (result.size() == 0) {
                System.out.print("[]");
            }
            for (int value : result) {
                System.out.print(value + " ");
            }
            System.out.println();
            t--;

            System.out.println("~");
        }
    }
    
    // Function to return list containing elements of left view of binary tree.
    public static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        return leftViewHelper(root, result,1);
    }
    static ArrayList<Integer> leftViewHelper(Node root, ArrayList<Integer> result, int level){

        if(root==null){
            return result;
        }
        if(level > maxLevel){
            result.add(root.data);
            maxLevel = level;
        }
        leftViewHelper(root.left, result, level+1);
        leftViewHelper(root.right, result, level+1);
        
        return result;
        
    }
        
        
        
        
        // Queue<Node> queue = new LinkedList<>();
        // if(root == null){
        //     return new ArrayList<Integer>();
        // }

        // queue.add(root);
        // while(!queue.isEmpty()){
        //     //System.out.println("Hi");
            
        //     int size = queue.size();
            
        //     //System.out.println(size);
        //     for(int i = 0; i<size; i++){
        //         Node current = queue.poll();
        //         //System.out.println("Hi");
        //         if(i==0){
        //             result.add(current.data);
        //         }
        //         if(current.left != null){
        //             queue.add(current.left);
        //         }
        //         if(current.right != null){
        //             queue.add(current.right);
        //         }
        //     }
            
        // }
        
        // return result;
    //}
}
