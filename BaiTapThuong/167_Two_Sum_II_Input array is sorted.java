// if use hashmap cost O(n) memory  => prority way 2 because array sorted 
// way 1

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] so = new int[2];
        
        // save value map
        for(int i = 0 ; i < numbers.length ; i++){
            map.put(numbers[i],i);
        }
        // so = target - arr[i]   if exist key map => print 
        for(int i = 0 ; i < numbers.length; i++){
            int so1 = target - numbers[i];
            if(map.get(so1)!=null){
                so[0] = i+1;
                so[1] = map.get(so1)+1;
                return so;
            }           
           
        }
        return so;
    }
}

// way 2 two pointer
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1; 
        while(left < right)
        {
            if(target  < numbers[left] + numbers[right]) right--;
            else if (target  > numbers[left] + numbers[right]) left ++;
            else return new int[]{left+1,right+1};
        }
       
        return new int[2];
    }
}