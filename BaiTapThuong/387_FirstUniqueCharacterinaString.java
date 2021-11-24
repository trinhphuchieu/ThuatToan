class Solution {
    public int firstUniqChar(String s) 
    {
      
        int[] a = new int[26];
        // Lọc này 
        for(int i = 0 ; i < s.length();i++)
        {   
           a[s.charAt(i)-'a']++; // search thoy :)
        }
      // Lọc ra phần tử xuất hiện 1 lần
        for(int i = 0 ; i < s.length();i++)
        {
            if(a[s.charAt(i)-'a']==1)   
            {
                return i;
            }
        }
        return -1;
    }
}
