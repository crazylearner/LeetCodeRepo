package com.ds.problems;


/*
 * Swap the node pairs in as singly linked list.
 * 
 * O(n) time.
 */
public class SolutionSwap {
    public ListNode1 swapPairs(ListNode1 head) {
    	ListNode1 pointer = head;
    	ListNode1 first = null;
    	ListNode1 prev = null;
    	int count = 1;
    	
    	
    	while(pointer != null){
    		if(count  == 2){
    			//swap
    			
    			first.next = pointer.next;
    			pointer.next = first;
    			if(head == first){
    				head = pointer;
    			}else{
    				prev.next = pointer;
    			}
    			prev = first;
    			
    			pointer = first.next;
    			count--;
    		}else{
    			first = pointer;
    			pointer = first.next;
    			count++;
    		}
    	}
    	
		return head;
        
    }
    
    public static void main(String arg[]){
    	ListNode1 l = new ListNode1(2);
    	ListNode1 l1 = new ListNode1(5);
    	ListNode1 l2 = new ListNode1(3);
    	ListNode1 l3 = new ListNode1(4);
    	ListNode1 l4 = new ListNode1(6);
    	ListNode1 l5 = new ListNode1(2);
    	
    	l.next = l1;
    	l1.next = l2;
    	l2.next = l3;
    	l3.next = l4;
    	l4.next = l5;
    	
    	System.out.println(l);
    	SolutionSwap s = new SolutionSwap();
    	System.out.println(s.swapPairs(l));
    	
    }
}

class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) { val = x; }
     
     @Override
     public String toString() {
     	 ListNode1 nextLi = this;
     	 String list = "";
     	while(nextLi != null){
     		list += nextLi.val + " ->";
     		nextLi = nextLi.next;
     	}
     	return list;
     }
}