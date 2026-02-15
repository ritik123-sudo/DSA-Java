package DSA;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class BinaryTree {
//     //Declare a node to make tree .We need to add node at every step.
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//     //Binary tree to add nodes and make tree.
//     static class binaryTree{
//         static int idx=-1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx]==-1){
//                 return null;
//             }
//             Node newNode=new Node(nodes[idx]);
//             newNode.left=buildTree(nodes);
//             newNode.right=buildTree(nodes);

//             return newNode;
//         }
//     }


//     public static void main(String []args){
//         // System.out.println("Hello World");
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         binaryTree tree=new binaryTree();
//         Node root=tree.buildTree(nodes);
//         System.out.println(root.data);
//     }
    
    // Declare a Node.Fundamental block of Tree.

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Making of PreOrder
    static class BinaryBuilderTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

    }

    /*
    PreOrder Traversal
    Printing elements one by one.
    Its Time Complexity is O(n).

    Order of print:-
        root
        left subtree
        right subtree
     */
    public static void preorder(Node root){
        if(root==null){
            System.out.print((-1) + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    /*
    Inorder Traversal
    Printing elements one by one.
    Its Time Complexity is O(n).
    Order of Print:-
        leftSubtree
        root
        rightSubtree
    */
    public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
    }


    /*
    Postorder Traversal
    Printing elements one by one.
    Its Time Complexity is O(n).
    Order of print:-
        leftSubtree
        rightSubtree
        root
    */
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    /*
    Level Order Traversal
    Can Also be Called "BFS(Breadth First Search"
    Its Time Complexity is O(n).
    */
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.err.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }


    //Question 1:-Count Number of Nodes
    
    public static int CountNode(Node root){
        if(root==null){
            return 0;
        }
        
        int left=CountNode(root.left);
        int right=CountNode(root.right);
        return left+right+1;

    }

    /*Sum of Nodes
    ⏱ Complexity
        Time: O(n)
        Space: O(h) (height of tree)
    */
    public static int SumofNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data+SumofNodes(root.left)+SumofNodes(root.right);
    }

    /*Height of a Tree
    Similar to level order traversal
     */
    public static void HeightofTree(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
            q.add(null);
        }
        int Height=0;
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                Height++;
                if(q.isEmpty()){
                    System.out.println(Height);
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    // Method 2: Height of tree
    public static int HeightTree(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(HeightTree(root.left),HeightTree(root.right));
    }

    // Diameter of Tree(Time Complexity =O(n2))
    public static int DiameterofTree(Node root){
        if(root==null){
            return 0;
        }
        int diameter=Math.max((HeightTree(root.left)+HeightTree(root.right)+1),Math.max(DiameterofTree(root.left),DiameterofTree(root.right)));
        return diameter;
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int height,int diam){
            this.ht=height;
            this.diam=diam;
        }
    }

    // Diameter of Tree(Time Complexity=O(n))
    public static TreeInfo DiameterTree(Node root){

        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo leftNode=DiameterTree(root.left);
        TreeInfo rightNode=DiameterTree(root.right);

        int myHeight=Math.max(leftNode.ht,rightNode.ht)+1;
        int diam1=leftNode.diam;
        int diam2=rightNode.diam;
        int diam3=leftNode.ht+rightNode.ht+1;

        int diam=Math.max(diam1,Math.max(diam2,diam3));

        TreeInfo info=new TreeInfo(myHeight, diam);
        return info;

    }

    class Solution{
        public boolean isIdentical(Node root,Node subRoot){
            if(root==null&&subRoot==null){
                return true;
            }
            if(root==null||subRoot==null){
                return false;
            }
            if(root.data==subRoot.data){
                return isIdentical(root.left, subRoot.left)&&isIdentical(root.right, subRoot.right);
            }
            return false;
        }
        public boolean isSubtree(Node root,Node subRoot){
            
            if(subRoot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
        }
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       
        Node root= BinaryBuilderTree.buildTree(nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);

        System.out.println();
        postorder(root);

        System.out.println();
        levelorder(root);

        System.out.println();
        System.out.print(CountNode(root));

        System.out.println();
        System.out.println(SumofNodes(root));

        System.out.println();
        HeightofTree(root);

        System.out.println(HeightTree(root));

        System.out.println(DiameterofTree(root));

        TreeInfo info=DiameterTree(root);
        System.out.println(info.diam);
    }
}


