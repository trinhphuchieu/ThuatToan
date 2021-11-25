class Solution {
    

     // way 1 fast Eeasy hiểu
    
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1]) return true;    
        }
        return false;
    }
    
    
    //  way 2 slow cách 1 và very điều mới về set java :)
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++)
        {
            // có thể dùng thêm hs.contains(nums[i])) //
            if(!hs.add(nums[i])) return true;
        }
        return false;
    }
}
