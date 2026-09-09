package Java_Basics;

import java.util.LinkedList;
import java.util.Queue;;

class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinTree1{
    private int idx=-1;
    public Node1 BinaTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node1 newNode=new Node1(nodes[idx]);
        newNode.left=BinaTree(nodes);
        newNode.right=BinaTree(nodes);
        return newNode;
    }

    public void preOrderTraversal(Node1 root){
        if(root==null){
            // System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    public void inOrderTraversal(Node1 root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);   
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node1 root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node1 root){
        if(root==null){
            return;
        }
        Queue<Node1> q=new LinkedList<>();

        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node1 currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(currNode);
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

    // Count of Nodes
    public int countTreeNode(Node1 root){
        if(root==null){
            return 0;
        }
        return 1+ countTreeNode(root.left)+countTreeNode(root.right);
    }

    // Sum of Nodes
    public int sumOfNode(Node1 root){
        if(root==null){
            return 0;
        }
        return root.data+sumOfNode(root.left)+sumOfNode(root.right);
    }

    // Height of Tree
    public int heigthOfTree(Node1 root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(heigthOfTree(root.left),heigthOfTree(root.right));
    }

    // Diameter of Tree
    private int m=0;
    public int DiamOfTree(Node1 root){
        
        if(root==null){
            return 0;
        }
        int diam1=DiamOfTree(root.left);
        int diam2=DiamOfTree(root.right);
        int diam3=1+heigthOfTree(root.left)+heigthOfTree(root.right);

        return Math.max(diam3,Math.max(diam1,diam2));
        

    }
    class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public TreeInfo diameter2(Node1 root){
        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=1+left.ht+right.ht;

        int mydiam=Math.max(diam1,Math.max(diam2,diam3));
        TreeInfo myInfo=new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    // Sum at Kth level
    public int sumAtKLevel(Node1 root,int n){
        if(root==null){
            return 0;
        }
        Queue<Node1> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int k=0;
        int sum=0;

        while(!q.isEmpty()){
            Node1 newNode=q.remove();

            if(newNode==null){
                if(q.isEmpty()){
                    k++;
                    if(k==n){
                        return sum;
                    }
                    break;
                }else{
                    k++;
                    if(k==n){
                        return sum;
                    }
                    q.add(null);
                    sum=0;
                }
            }else{
                if(newNode.left!=null){
                    q.add(newNode.left);
                    // sum+=newNode.left.data;
                }
                if(newNode.right!=null){
                    q.add(newNode.right);
                    // sum+=newNode.right.data;
                }
                sum+=newNode.data;
            }
        }
        return 0;

    }
}
public class BinaryTree {
     public static void main(String[] args) {
        BinTree1 tree=new BinTree1();
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node1 root=tree.BinaTree(nodes);
        // System.out.println(root.data);
        // tree.preOrderTraversal(root);
        // tree.inOrderTraversal(root);
        // tree.postOrderTraversal(root);
        // tree.levelOrder(root);
        // System.out.println(tree.countTreeNode(root));
        // System.out.println(tree.sumOfNode(root));
        // System.out.println(tree.heigthOfTree(root));
        // System.out.println(tree.DiamOfTree(root));
        // System.out.println(tree.diameter2(root).diam);
        System.out.println(tree.sumAtKLevel(root, 2));
    }
}
