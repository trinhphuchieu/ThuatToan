class Solution {
  
    public int lengthOfLongestSubstring(String s) 
    {
        int count = 0 ;
        String chu = "";
        for(int i = 0 ; i < s.length(); i ++)
        {
            if(chu.indexOf(s.charAt(i)) == -1)
            {
                chu += s.charAt(i);
                count ++;
            }else break;
            
        }
        int max = count;
        int y = 0 ;
        for(int i = count; i < s.length() ; i ++)
        {
            if(chu.indexOf(s.charAt(i)) > -1)
            {
                chu = chu.substring(chu.indexOf(s.charAt(i))+1) + s.charAt(i);
               
            }else
            {
                chu += s.charAt(i);
              
            }
            
            if(chu.length() > max) max = chu.length();
  
        }
       
        return max;
    }
  // way 2 refer
  
  public int lengthOfLongestSubstring(String s)
    {
    // dùng hashmap
        HashMap<Character,Integer> map = new  HashMap<Character,Integer>();
        
        int max = 0 ;
        for(int  i = 0 , j = 0; i < s.length() ; i ++)
        {
            if(map.containsKey(s.charAt(i))) 
            {
                j = Math.max(j,map.get(s.charAt(i))+1); // lí do dùng max tránh trường hợp abba
            
           
            }
            map.put(s.charAt(i),i); 
            max = Math.max(max,i - j + 1); 
        }
        
        return max;
    }
}

