import java.util.*;
public class BinarytreeYT{
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

     static class Binarytree{
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
    public static void preorder(Node root){
        if(root==null){
            System.out.print(-1+ " ");
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            //System.out.print(-1 +" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
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
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
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
    //count number of nodes:-
    //First count left side of node and then count right side of nodes and then root node.
    //formulae :- X+Y+1; This formulae will called recursively untill reached to null;
    public static int countnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countnodes(root.left);
        int rightNodes=countnodes(root.right);

        return leftNodes+rightNodes+1;
    }
    /*Sum of Nodes:-
        first add left side  and then add right side and then add it with root node 
     */
    public static int sumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumofNodes(root.left);
        int rightSum=sumofNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    /*Height of tree:-
     * calculate height of left subtree and right subtree
     * compare height of left and right subtree 
     * add 1 for root with whichever is larger
     */
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;

    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int diam3=leftHeight+rightHeight+1;
        return Math.max(diam3, Math.max(diam2, diam1));

    }
    static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Treeinfo diameter2(Node root){
            if(root==null){
                return new Treeinfo(0, 0);
            }
            Treeinfo left=diameter2(root.left);
            Treeinfo right=diameter2(root.right);
            int myHeight=Math.max(left.ht,right.ht)+1;

            int diam1=left.diam;
            int diam2=right.diam;
            int diam3=left.ht+right.ht+1;

            int mydiam=Math.max(diam2, Math.max(diam1, diam3));
            Treeinfo myinfo=new Treeinfo(myHeight, mydiam);
            return myinfo;

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //Binarytree tree=new Binarytree();
        Node root=Binarytree.buildTree(nodes);
        System.out.println(diameter2(root).diam);
        //levelorder(root);
    }
}
