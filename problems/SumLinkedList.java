package com.ds.problems;

public class SumLinkedList {

	public static void main(String[] args) {
		ListNode li = new ListNode(2);
		ListNode li1 = new ListNode(4);
		//ListNode li2 = new ListNode(3);
		li.next = li1;
		//li1.next = li2;
		
		ListNode li3 = new ListNode(5);
		ListNode li4 = new ListNode(6);
		ListNode li5 = new ListNode(4);
		li3.next = li4;
		li4.next = li5;
		
		Solution1 sol1 = new Solution1();
		ListNode sumNode = sol1.addTwoNumbers(li, li3);
		System.out.println(sumNode.toString());
	}

}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     
     @Override
    public String toString() {
    	 ListNode nextLi = this;
    	 String list = "";
    	while(nextLi != null){
    		list += nextLi.val + " ->";
    		nextLi = nextLi.next;
    	}
    	return list;
    }
}

class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode currNode1 = l1;
    	ListNode currNode2 = l2;
    	ListNode firstSumNode = null;
    	ListNode currSumNode = null;
    	ListNode nextSumNode;
    	int sum = 0;
    	int carryOver = 0;
    	boolean hasMoreEle1 = (currNode1 != null);
    	boolean hasMoreEle2 = (currNode2 != null);
    	while( hasMoreEle1 || hasMoreEle2){
    		if(hasMoreEle1 && hasMoreEle2){
    			sum = currNode1.val + currNode2.val + carryOver;
    			currNode1 = currNode1.next;
    			currNode2 = currNode2.next;
    		}else if(hasMoreEle1){
    			sum = currNode1.val + carryOver;
    			currNode1 = currNode1.next;
    		}else if(hasMoreEle2){
    			sum = currNode2.val + carryOver;
    			currNode2 = currNode2.next;
    		}
    		hasMoreEle1 = (currNode1 != null);
	    	hasMoreEle2 = (currNode2 != null);
	    	carryOver = 0;
	    	
	    	nextSumNode = new ListNode(sum % 10);
	    	carryOver = sum/10;
	    	
	    	if(firstSumNode == null){ 
	    		firstSumNode = nextSumNode;
	    		currSumNode = nextSumNode;
	    	}else{
	    		currSumNode.next = nextSumNode;
	    		currSumNode = nextSumNode;
	    	}
    	}
    	if(carryOver != 0){
    		nextSumNode = new ListNode(carryOver);
    		currSumNode.next = nextSumNode;
    	}
    	
    	return firstSumNode;
    }
}
