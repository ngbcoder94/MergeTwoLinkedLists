/*
 * Welcome to my Java Class!!! 
 * Author: Nick Burkett
 * Created for: Leetcode problem
 * Date: 08/09/2024
 */

public class MergeTwoLinkedLists{

        public static void main(String args[]){
                System.out.println("Hello World... my class is now set up to solve my Leetcode problem");

                ListNode head = new ListNode();
                System.out.println(head.val);
                ListNode tmpHead = head;
                for(int i = 0; i < 20; i++){
                        if(tmpHead.val == 0 && i !=0){
                                tmpHead.val = i;
                        }
                        else{
                                ListNode tmpVar = new ListNode(i);
                                tmpHead.next = tmpVar; 
                                tmpHead = tmpHead.next;
                        }
                }
                for(ListNode var = head; var != null; var = var.next){
                        System.out.printf("(%d)-->", var.val);
                }
                System.out.println("||");

                for(int i = 0; i < 5; i++){
                        System.out.println();
                }
                System.out.println("YOUR A FUCKING HOMO!!!!!!!!");
        }
}
