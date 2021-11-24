class Solution
{
    // Tham lam :(
    // Đặc điểm nhận diện của algorithm là luôn sắp xếp mảng trước :)
  
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0) return 0; 
        int max = 0;
        int flag = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0 ; i < g.length; i++)
        {
            if(flag == s.length) break;
            if(g[i] == s[flag])
            {
                max++;
                flag++;
            }
            else
            {
                while(flag < s.length)
                {
                  if(s[flag] >= g[i])
                  {
                      max++;
                      flag++;
                      break;
                  }
                    flag++;
                }    
            }
        }         
        return max;
    }

}
