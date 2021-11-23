import java.util.HashMap;


// chua toi uu :((

class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else
            {
                map.put(nums[i],0);    
            }
        }
        int max = 0;
        int k = nums[0];
        for (Integer key : map.keySet()) {
            if(max < map.get(key)){
                max = map.get(key);
                k = key;
            } 
        }
        return k;
       
    }
}
