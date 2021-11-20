class Solution {
    // way 1
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        int sec = 0;
        int i = 0;
        while(tickets[k] != 0)
        {
            if(i == tickets.length) i = 0; 
            if(tickets[i] <= 0)
            {
                i++;
                continue;
            } 
            sec ++;
            tickets[i]--;
            if(tickets[k] == 0) break;
            i++;
        }
        return sec;
    }
    
    // way 2 kakashi ninja copy :)
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        int sec = 0;
        for(int i = 0 ; i < tickets.length; i++)
        { 
            if(i > k)  sec += Math.min(tickets[i],tickets[k]-1);
            else sec += Math.min(tickets[i],tickets[k]);
        }
        return sec;
    }
}
