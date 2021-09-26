package ThuatToan;

import java.util.Arrays;

public class BinarySearch_704 {
		
	
	// thuật toán tìm kiếm hỏi đố với điều kiện là dãy đó phải được sắp xêp rồi
	// vd cho 100 chữ số đoán 1 số trong đó 
	// thuật toán sẽ hỏi số mình chọn với số đoán đó 
	
	// đầu tiên sẽ hỏi số đó có lớn hơn 50 hay nhỏ hơn 50 
	// sau đó cứ tiếp tục chia rồi hỏi như vậy đến khi tìm được kết quả 
	// người lại nếu ko tìm được thì chứng tỏ thằng đưa đáp án xạo l

	
	    public static int search(int[] nums, int target) {
	    	Arrays.sort(nums);
	    	int left = 0 ;
	    	int right = nums.length - 1;
	    	
	    	while(left <= right) 
	    	{
	    		int mid  = left  + (right - left)/2; 
	    		if(nums[mid] == target) return mid; 
	    		if(nums[mid] > target) right = mid - 1;
	    		else left = mid + 1;
	    	}
	    	return -1;	
	    }
	    public static void main(String []args) {
	    	System.out.println(search(new int[]{1,2,3,4,5,6,7,8,9,10},3));
	    }

}
