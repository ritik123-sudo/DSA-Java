package Java_Basics;

import java.util.LinkedList;

//  * Definition for singly-linked list.
 class ListNode {
    int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode currNode=head;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prev;

            // Update
            prev=currNode;
            currNode=nextNode;
        }
        return head;
    }
    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode head2=reverse(head);
        while(head!=null){
            if(head.val!=head2.val){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;
    }
}
public class LLQuestion3 {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        // ListNode currHead=head;
        
        ListNode e1=new ListNode(2);
        head.next=e1;

        ListNode e2=new ListNode(2);
        e1.next=e2;

        ListNode e3=new ListNode(1);
        e2.next=e3;


        Solution s1=new Solution();
        System.out.println(s1.isPalindrome(head));
    }
}
