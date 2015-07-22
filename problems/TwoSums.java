package com.ds.problems;
import java.util.HashMap;

/**
 * 
 *Two Sums problem: Find in an array two numbers that equals the given sum.
 *    O(n) space and O(n) time
 * Other solution would be to sort the array: O(nlogn). For each element in the sorted array, use binary search to find the difference number: O(nlogn)
 *
 */
public class TwoSums {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int num[]= {3,2,4};
		sol.twoSum(num, 6);
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
    	int diff;
    	int[] indices = new int[2];
    	for(int i=0;i<nums.length;i++){
    		diff = target- nums[i];
    		if(hmap.containsKey(diff)){
    			indices[0] = hmap.get(diff)  + 1;
    			indices[1] = i +1;
    			System.out.println(indices[0] +" , "+ indices[1]);
    			return indices;
    		}
    		hmap.put(nums[i], i );
    	}
    	return null;
    }
}