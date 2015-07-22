package com.ds.problems;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Finds the length of the longest non-repeating substring.
 * O(n) time and O(n) space
 *
 */
public class LengthOfLongestSubStr {

	public static void main(String[] args) {
		
		System.out.println(new Solution3().lengthOfLongestSubstring("vqblqcb"));
		System.out.println(new Solution3().lengthOfLongestSubstring("aabqlcab"));
		System.out.println(new Solution3().lengthOfLongestSubstring("aabaaa"));
		System.out.println(new Solution3().lengthOfLongestSubstring("bbtablud"));
	}

}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
		
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	
    	int i = 0;
    	int bigLen = 0;
    	int subStrLen = 0;
    	int subStrStartIndex =0;
    	while(i<s.length()){
    		if(map.containsKey(s.charAt(i)+"") && map.get(s.charAt(i)+"") >= subStrStartIndex){
    			if(subStrLen > bigLen){
    				bigLen =subStrLen;
    			}
    			subStrLen = i - map.get(s.charAt(i)+"");
    			subStrStartIndex = map.get(s.charAt(i)+"")+1;
    			map.put(s.charAt(i)+"", i);
    		}else{
    			map.put(s.charAt(i)+"", i);
    	    	subStrLen++;
    		}
    		i++;
    	}
    	if(subStrLen > bigLen){
			bigLen =subStrLen;
		}
    	return bigLen;
    }
}
