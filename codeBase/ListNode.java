/*
 * This is my ListNode class that will be used for testing...
 *... during for my merging problem.
 *
 * Author: Nick Burkett
 * Date: 08/22/24
 *
 */
public class ListNode{

        int val;            //Integer to hold the value
        ListNode next;      //Create the pointer variable to the next node.
        ListNode() {}      //Created an empty constructor. 

        /*
         * Here is my constructor for the Listnode
         *
         * int val = value that I will pass in pertaining to the value of the node
         */
        ListNode(int val) {
                this.val = val;     //Assign val correctly
        }

        /*
         * Overrided constuctor for the ListNode class
         * 
         * int val = value that I will pass in pertaining to the value of the node
         */
        ListNode(int val, ListNode next){
                this.val = val;           //Assign val correctly 
                this.next = next;   //Assgin the next node correctly. 
        }
}
