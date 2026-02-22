package DSA;

import java.util.*;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            
        }
    }
    /*Making of a BST */
    // Time Complexity: O(Height)
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
            
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    // Traversal of BST
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Search a BST
    public static boolean SearchBST(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(val>root.data){
            return SearchBST(root.right, val);
        }else if(val<root.data)
        {
            return SearchBST(root.left, val);
        }
        else{
            return false;
        }
        
    }

    // Delete a Node in BST
    public static Node delete(Node root ,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }else if(root.data<val){
            root.right=delete(root.right,val);
        }else{
            // root.data==val

            // Case 1:No child
            if(root.left==null&&root.right==null){
                return null;
            }

            // Case 2:One child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // Case 3:Two child
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    // Print in Range
    public static void printInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data>=Y){
            printInRange(root.left, X, Y);
        }else{
            printInRange(root.right, X, Y);
        }
    } 
    // PrintPath
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    // Root to Leaf Paths
    public static void printRoot2leaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }else{
            printRoot2leaf(root.left,path);
            printRoot2leaf(root.right, path);
        }

        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        // System.out.println(SearchBST(root, 110));

        delete(root,5);
        inorder(root);

        System.out.println();
        printInRange(root,6 , 12);
        System.out.println();

        printRoot2leaf(root,new ArrayList<>()) ;
    }
}
