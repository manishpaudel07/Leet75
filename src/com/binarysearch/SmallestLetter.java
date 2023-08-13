package com.binarysearch;

/*You are given an array of characters letters that is sorted in non-decreasing order, 
 * and a character target. There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than target. 
 * If such a character does not exist, return the first character in letters.
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is
lexicographically greater than 'z' so we return letters[0].*/
public class SmallestLetter {
	
	 public static char nextGreatestLetter(char[] letters, char target) {
		
		 int left=0;
		 int right= letters.length-1;
		 int mid=0;
		 while (left<=right)
		 {
			 mid=left+(right-left)/2;
			
			 
			 if(letters[mid]<=target)
			 {
				 left=mid+1;
			 }else
				 right=mid-1;		 
			 
		 }
		 
		 
		 return (left < letters.length) ? letters[left] : letters[0];
	        
	        
	    }

	public static void main(String[] args) {

		
		char[] letters= {'x','x','y','y'};
		  
		char target='z';
		
		System.out.println(nextGreatestLetter(letters, target));
	}

}
