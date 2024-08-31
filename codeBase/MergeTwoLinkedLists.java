/*
 * Welcome to my Java Class!!! 
 * Author: Nick Burkett
 * Created for: Leetcode problem
 * Date: 08/09/2024
 */

public class MergeTwoLinkedLists{

        /*
         * Here is the mergeLists function that I am creating
         *
         * @var nodeA, nodeB: the heads of the two lists I am working with
         * @return ListNode: Need to reurn a ListNode object (head of the new linked list)
         */
        public ListNode mergeLists(ListNode nodeA, ListNode nodeB){
                return null;
        }
        
        /*
         * Method that will be used to add a node to the lined list
         *
         *@var tmpHeadPtr: variable passed in that is the current node in the list.
         *@var tmpIntVal: variable passed in that needs to be added
         *@return: void
         */
        public void insertBetween(ListNode tmpHeadPtr, int tmpIntVal){

                //System.out.println("Here too");
                ListNode tmpNodeVar = new ListNode();                  //Create new node to add
                tmpNodeVar.val = tmpIntVal;
                tmpNodeVar.next = tmpHeadPtr.next;
                tmpHeadPtr.next = tmpNodeVar;                          //Increment the LL
                tmpHeadPtr = tmpHeadPtr.next;                          //Set the head to the next node
        }

        public static void main(String args[]){
                //System.out.println("Hello World... my class is now set up to solve my Leetcode problem");
                
                MergeTwoLinkedLists llObj = new MergeTwoLinkedLists();

                ListNode head = new ListNode();
                System.out.println(head.val);
                ListNode tmpHead = head;
                for(int i = 0; i < 5; i++){
                       
                        if(tmpHead.val == 0 && i !=0){
                                tmpHead.val = i;
                        } 
                        else{
                                ListNode tmpVar = new ListNode(i);
                                tmpHead.next = tmpVar; 
                                tmpHead = tmpHead.next;
                        }
                }
                
                int j = 0;
                
                
                for(ListNode var00 = head; var00 != null; var00 = var00.next){
                       System.out.println("Here");
                       if(j==2){
                                System.out.println(var00.val);
                                llObj.insert(var00, 0);
                       }
                       j++;
                } 
                
                
                

                for(ListNode var = head; var != null; var = var.next){
                        System.out.printf("(%d)-->", var.val);
                }
                System.out.println("||");            

        }
}
