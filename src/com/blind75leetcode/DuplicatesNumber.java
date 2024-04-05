package com.blind75leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesNumber {

	 public boolean containsDuplicate(int[] nums) {
	        
	        Set<Integer> set=new HashSet<>();
	        
	        for (int i=0;i<nums.length;i++)
	        {
	            if (!set.add(nums[i]))
	            {
	                return true;
	            }            
	        }
	        
	        return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner =new Scanner(System.in);
	DuplicatesNumber duplicatesNumber=new  DuplicatesNumber();
	
	
	int []arr=new int [5];
	
	
	for (int i=0;i<arr.length;i++ )
		
	{
		arr[i]=scanner.nextInt();
	}
	
	boolean result =duplicatesNumber.containsDuplicate(arr);
	System.out.println("TRUE if duplicates numbers are present and FALSE if duplicates num are not present :"+result);
	}

	//testing out revert,reset, git commands

}
