class Solution {
    
    // way 1 fast 5.04%  Memory  67% 
    public boolean isPerfectSquare(int num) {
        
        if(num <= 10)
        {
            if(num == 1 || num == 4 || num == 9) return true;
            else return false;
        }
        int l = 0;
        int r =  l  + (num - l)/2;
        int pivot = 0;
        
        while(l <= r)
        {
            pivot = l  + (r - l)/2;
            if(pivot * pivot == num) return true;
            int prev = r;
            r = pivot - 1;
            if(r * r < num)
            {
                while(prev > 0)
                {
                    if(prev * prev == num) return true;
                    prev--; 
                }
                break;
            }
 
        }
        return false;
    }
    
    // way 2 binarySearch fast 100%  memory 18%
    public boolean isPerfectSquare(int num) {
        
        if(num <= 10)
        {
            if(num == 1 || num == 4 || num == 9) return true;
            else return false;
        }
        
        long l = 0;
        long r =  l  + (num - l)/2;
        long pivot = 0;
        
        while(l <= r)
        {
            pivot = l  + (r - l)/2;
            if(pivot * pivot == num || (pivot-1)*(pivot-1) == num || (pivot+1)*(pivot+1) == num) return true;
            else if(pivot * pivot > num)
            {   
                r = pivot - 1;       
            }else 
            {
                l = pivot + 1; 
            }
 
        }
        return false;
    }
}
