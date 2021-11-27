
class Solution {
    
    // reference solution .Prefect
    // reference If Programming Was An Anime
    // The Tortoise and Hare algorithm
    public int findDuplicate(int[] nums) 
    {
        int i = 0;
        int r = nums[0];
        int t = nums[0];
        while(true)
        { 
            if(i == nums.length) i = 0;
            r = nums[r]; // t
            t = nums[nums[t]]; // vt t run  
            if(r == t) break;
        }
        
        r = nums[0];
        while(r!=t)
        {
            r = nums[r];
            t = nums[t];
        }
        
        return r;  
    }
}
