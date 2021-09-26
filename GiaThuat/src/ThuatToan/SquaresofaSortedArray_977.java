package ThuatToan;

import java.util.Arrays;

public class SquaresofaSortedArray_977 {
	/*
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0 ;i < nums.length ; i++){
            nums[i] = Math.abs(nums[i]*nums[i]); 
        }
        Arrays.sort(nums);
    
        return nums;
    }
    */
	// cách 2 áp dụng two pointer
	// đề cho dãy đã sắp xếp giảm dần thì chỉ chyển khi bình phương phần tử âm lớn hơn phần tử cuổi
	public static int[] sortedSquares(int[] nums) {
		int []s = new int[nums.length];
		int left = 0, right = nums.length-1;
		int cs = nums.length-1;
		while(left <= right) {
			int v1  = nums[left] * nums[left];
			int v2 = nums[right] * nums[right];
			if(v1 > v2) {
				s[cs] = v1;
				left++;
			}else {
				s[right] = v2;
				right--;
			}
			cs =-1;
		}
		return s;
    }
    
    public static void main(String []args) {
    	System.out.println(Arrays.toString(sortedSquares(new int[]{1,2,3,4,5,6,7,8,9,10})));
    }
}
