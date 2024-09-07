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
         * This will be my 
        /*
         * Here is my insertStart() function that will insert a node...
         * ...at the beginning of a list.
         *
         *@param tmpHeadPtr: Node of the beginning of the list
         *@Param tmpIntVal: Value to add to the list
         */
        public ListNode insertStart(ListNode tmpHeadPtr, int tmpIntVal){
                
                ListNode tmpNodeVar = new ListNode();           //Need to create a new node
                tmpNodeVar.val = tmpIntVal;                     //Add the new value to the node
                tmpNodeVar.next = tmpHeadPtr;                   //Link the new node to the one passed in
                return tmpNodeVar;
        }

        /*
         * This will be my insertBefore() function
         *
         * @param - ListNode list1, list2 - two lists passed in.
         * @param - head - start of the original start of the list
         * @param - newVal - new value to be added. 
         */
        public ListNode insertBefore(ListNode head, ListNode targetNode, int newVal){
                
                //Need to check if the list is an empty list
                if(head == null){
                        return new ListNode(newVal);        //Add in the new node
                }

                //Check if I have found the targetNode
                if(head == targetNode){
                        return insertStart(head, newVal);   //Add in the target node
                }

                //Now I need to traverse the list to find the node just before targetNode
                ListNode prev = null;           //Set the previous. 
                ListNode current = head;        //Set the current to the head
                
                while(current != null && current != targetNode){
                        prev = current;              //Update prev to the current prior to moving the ptr
                        current = current.next; 
                }

                //If we find the target node, insert the new node before it
                if(current == targetNode){
                        ListNode newNode = new ListNode(newVal);        //Create a new node
                        prev.next = newNode;                            //Set prev to the new node
                        newNode.next = current;                         //Set the new node's next to the target node
                }

                return head;       //Return the head of the list
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

        /*
         * Here is my insertEnd() function that will allow me to add a node to the end of the LL. 
         *
         *@param ListNode tmpNode - Head of the LL
         *@param int valVar - value to be added to the new node
         */
        public void insertEnd(ListNode tmpNode, int valVar){

                //Need to get to the end of the LL
                for(ListNode tmp = tmpNode; tmp != null; tmp = tmp.next){
                        //Need to check and see if we are at the end of the list
                        if(tmp.next == null){ 
                                ListNode node = new ListNode();      //Create a new node
                                node.val = valVar;                   //Add the new val to the node
                                node.next = null;                    //Update the pointer to null (end of LL)
                                tmp.next = node;                     //Update the last node in the LL to the newly created last node
                                tmp = tmp.next;                      //Move the ptr to the next, newly added node.
                        }
                }
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
                tmpHead = head;
                llObj.insertEnd(tmpHead, 100);
                //int j = 0;
                
                /*
                for(ListNode var00 = head; var00 != null; var00 = var00.next){
                       System.out.println("Here");
                       if(j==2){
                                System.out.println(var00.val);
                                llObj.insert(var00, 0);
                       }
                       j++;
                } 
               */ 
                
                

                for(ListNode var = head; var != null; var = var.next){
                        System.out.printf("(%d)-->", var.val);
                }
                System.out.println("||");            

        }
}
