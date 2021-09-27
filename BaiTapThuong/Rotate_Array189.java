class Solution {
    public void rotate(int[] nums, int k) 
    { 
        int left= 0 ; 
      
        if(nums.length <= 1 )
        {
            return;
        }
        
        int num =  Math.abs(k - k / nums.length * nums.length);
      
        int right = nums.length - num;
        sapXep(nums,0,nums.length - 1);      
        sapXep(nums,0,num-1);
        sapXep(nums,num,nums.length-1);
      
         System.out.println(Arrays.toString(nums));
        
    }
    public void sapXep(int[] nums,int left, int right){
        while(left < right)
        {
            int temp  = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
 
    
}
