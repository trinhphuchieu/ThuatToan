class Solution {
    
    //way 1 reference solution
    public int reverse(int x) 
    {
        int rs = 0;
        while(x != 0)
        {
            int mod = x % 10;
            if(mod >= 7 && rs == Integer.MAX_VALUE/10 || rs > Integer.MAX_VALUE/10)
            {
                return 0;
            }
            if(mod <= -8 && rs == Integer.MIN_VALUE/10 || rs < Integer.MIN_VALUE/10)
            {
                return 0;
            }
            rs = rs * 10 + mod;
            x/=10;
        }
        return rs;      
    }
    
    //way 2 reference discuss My accepted 15 lines of code for Java
    
    public int reverse(int x) 
    {
        int rs = 0;
        while(x != 0)
        {
            int mod = x % 10; 
            int ns = rs * 10 + mod;
            if((ns - mod)/10 != rs) return 0; // because overflow new Result def 
            rs = ns;
            x/=10;
        }
        return rs;      
    }
}
