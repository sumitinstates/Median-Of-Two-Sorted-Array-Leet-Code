package com.sumit;

public class Solution {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        
        int [] result = new int[nums1.length + nums2.length];
        
        int i = 0, j =0 , k=0;
        int m = nums1.length;
        int n = nums2.length;
        
        while((i<m) && (j<n))
        {
            if(nums1[i]<nums2[j])
            {
                result[k] = nums1[i];
                i++;
                k++;
            }else{
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        while(i<m)
        {
            result[k] = nums1[i];
            i++;
            k++;
        }
        
         while(j<n)
         {
            result[k] = nums2[j];
            j++;
            k++;
         }
        
       if((m+n)%2!=0)
       {
           return result[(m+n)/2];
           
       }
       else
       {
           int x = (m+n)/2;
           double p = result[x];
           double q = result[x-1];
           double median = (p+q)/2;
           return median;
       }
    
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,3}; 
		int[] nums2 = {2};
		int[] nums3 = {1,2};
		int[] nums4 = {3,4};
		
		System.out.println(Solution.findMedianSortedArrays(nums1, nums2));
		
		System.out.println(Solution.findMedianSortedArrays(nums3, nums4));
	}

}
