import java.util.Hashtable;
class Solution {
    // way  50%
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> has = new Hashtable<Integer, Integer>();
        
        for(int i = 0 ;i < nums.length; i++)
        {
            has.put(nums[i],i);
        }
            
        for(int i = 0 ;i < nums.length; i++)
        {
            int num = target - nums[i];
            if(has.containsKey(num) && i != has.get(num)) return new int[]{i,has.get(num)};  
        }
            
        return new int[]{0,0};
            
        
    }
       // way 99%
        public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> has = new HashMap<Integer, Integer>();
        for(int i = 0 ;i < nums.length; i++)
        {
            int num = target - nums[i];
            if(has.containsKey(num)) 
            {
                 return new int[]{i,has.get(num)}; 
            }else
            {
                 has.put(nums[i],i);    
            } 
        }
        return new int[]{0,0};       
    }
    //way 0% :))
    // way 3 sorted array if test no required
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left<right)
        {
            int num = nums[right] + nums[left];
            if(num > target) right --;
            else if(num < target) left ++;
            else break;
        }
        return new int[]{left,right};
            
        
    }
    
}
