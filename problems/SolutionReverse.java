package com.ds.problems;
/**
 * 
 * In a linked list of length n, reverse the consecutive k nodes, where k<n;
 * 
 * O(n) time
 */
public class SolutionReverse {

	public static void main(String[] args) {
		ListNode2 l = new ListNode2(1);
    	ListNode2 l1 = new ListNode2(2);
    	ListNode2 l2 = new ListNode2(3);
    	ListNode2 l3 = new ListNode2(4);
    	ListNode2 l4 = new ListNode2(5);
    	ListNode2 l5 = new ListNode2(6);
    	
    	l.next = l1;
    	l1.next = l2;
    	l2.next = l3;
    	l3.next = l4;
    	l4.next = l5;
    	
    	System.out.println(l);
    	SolutionReverse sr = new SolutionReverse();
    	System.out.println(sr.reverseKth(l, 4));

	}
	
	public ListNode2 reverseKth(ListNode2 head, int k){
		if(head == null){
			return head;
		}
		ListNode2 lengthPointer = head;
		int length = 1;
		while(lengthPointer.next != null){
		    length++;
		    lengthPointer = lengthPointer.next;
		}
		System.out.println(length);
		if(length < k){
		    return head;
		}
		ListNode2 alwaysHead = head;
		ListNode2 position = head.next;
		ListNode2 temp =null;
		int noOfNodes = 1;
		while(position != null && noOfNodes != k){
			head.next = position.next;
			position.next = alwaysHead;
			
			//currTail = alwaysHead;
			temp  = position;
			position = head.next;
			alwaysHead = temp;
			noOfNodes++;
		}
		
		System.out.println("Head" + alwaysHead);
		head.next = reverseKth(position, k);
		return alwaysHead;
	}
	
	public ListNode2 reverseKtoLth(ListNode2 head, int k, int l){
		if(head == null){
			return head;
		}
		ListNode2 lengthPointer = head;
		int length = 1;
		while(lengthPointer.next != null){
		    length++;
		    lengthPointer = lengthPointer.next;
		}
		System.out.println(length);
		if(length < k){
		    return head;
		}
		ListNode2 alwaysHead = head;
		ListNode2 position = head.next;
		ListNode2 temp =null;
		int noOfNodes = 1;
		while(position != null && noOfNodes != k){
			head.next = position.next;
			position.next = alwaysHead;
			
			//currTail = alwaysHead;
			temp  = position;
			position = head.next;
			alwaysHead = temp;
			noOfNodes++;
		}
		
		return alwaysHead;
	}

}

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
    
    @Override
   public String toString() {
   	 ListNode2 nextLi = this;
   	 String list = "";
   	while(nextLi != null){
   		list += nextLi.val + " ->";
   		nextLi = nextLi.next;
   	}
   	return list;
   }
}