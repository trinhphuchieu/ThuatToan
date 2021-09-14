class Solution {
	
	
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums); // sắp xếp 
        
        int tong = 0;        
        for(int  i = 0 ; i < nums.length; i+=2){
            tong += nums[i]; // lấy giá trị nhỏ vd: 1 2 3 4 5 6 lấy 1 3 5
        }
        return tong;
    }
}