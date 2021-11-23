class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0;i<nums.length;i++)
        {
            num ^=nums[i]; // xor 4^1^2^1^2 = 4 ^ (1^1)^(2^2)
        }
        return num;
    }
}
