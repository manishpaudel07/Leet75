package Leet75.src.com.blind75leetcode;

import java.util.Arrays;


/*Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. \
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/
public class InsertPosition {
	 public static int searchInsert(int[] nums, int target) 
	 {   
		 Arrays.sort(nums);
		 int left = 0;
	        int right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                return mid;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	    
	        // The 'left' variable now represents the position where the target should be inserted.
	        return left;
	        
	    }
	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		int[] array= {1,3,4,5,6};
		int target=2;
		 System.out.println(searchInsert(array, target));

	}

}
