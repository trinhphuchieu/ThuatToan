import java.util.HashMap;




class Solution {
    // chua toi uu :((
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
    
    // A Linear Time Majority Vote Algorithm
    // Điều kiện áp dụng thuật toán khi số phần tử trong mảng chiếm hơn [n/2]. :( 
    public int majorityElement(int[] num) {
        int mj = num[0];
        int count = 0;
        for(int i  = 0 ; i < num.length ; i++)
        {
            if(count == 0) mj = num[i];
            if(mj == num[i])
            {
                count+=1;
            }else
            {
                count -= 1;    
            }
        }
        return mj;       
    }
}
