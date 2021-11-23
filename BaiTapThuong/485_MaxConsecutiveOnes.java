class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for(int i = 0 ; i < nums.length; i++)
        { 
            if(nums[i] == 0) sum1 = 0;
            else sum1+=1;
            if(sum1 > sum)  sum = sum1;
        }
        return sum;
    }
}
