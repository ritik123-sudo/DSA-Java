package Java_Basics;
import java.util.*;
public class BinarySearchTree {
    static class Node1{
        int data;
        Node1 left;
        Node1 right;

        Node1(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node1 insert(Node1 root,int value){
        if(root==null){
            return new Node1(value);
        }
        if(value<root.data){
            root.left=insert(root.left, value);
        }
        if(value>root.data){
            root.right=insert(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node1 root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean SearchBST(Node1 root, int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(val<root.data){
            return SearchBST(root.left, val);
        }else{
            return SearchBST(root.right, val);
        }
    }

    public static Node1 SearchIS(Node1 root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static Node1 deleteNode(Node1 root,int val){
        if(root==null){
            return root;
        }
        if(val<root.data){
            root.left=deleteNode(root.left, val);
        }else if(val>root.data){
            root.right=deleteNode(root.right, val);
        }else{
            // case 1
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            // case 3
            Node1 IS=SearchIS(root.right);
            root.data=IS.data;
            root.right=deleteNode(root.right, IS.data);
        }
        return root;
    }

    public static void printInRange(Node1 root,int left,int right){
        if(root==null){
            return;
        }
        if(left<=root.data && right>=root.data){
            printInRange(root.left, left, right);
            System.out.print(root.data+" ");
            printInRange(root.right, left, right);
        }else if(right<root.data){
            printInRange(root.left, left, right);
            // System.out.print(root.data+" ");
        }else{
            printInRange(root.right, left, right);
            // System.out.println();
        }
    }
    public static void printPaths(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void root2leaf(Node1 root, ArrayList<Integer> path){
        if(root==null){
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPaths(path);
        }else{
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int[] values={5,1,3,4,2,7};
        Node1 root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        // inOrder(root);
        // System.out.println(SearchBST(root, 3));
        root2leaf(root, new ArrayList<>());
    }
}
