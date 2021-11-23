class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int len = accounts[0].length;
        for(int [] a : accounts)
        {
            int sum = 0;
            for(int i = 0 ; i < len ;i++)
            {
                sum+= a[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
