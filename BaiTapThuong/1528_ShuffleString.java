class Solution {
    
    public String restoreString(String s, int[] indices) {
        String text = "";
        int i = 0;
        while(i < indices.length)
        {
            for(int j = 0; j < indices.length; j++)
            {
                if(i == indices[j])
                {
                    text += s.charAt(j); 
                    break;
                }
            }
            i++;
        }
        return text;
    }
    
    // tham khao 
    public String restoreString(String s, int[] indices) {
        int i = 0;
        char[] charr = s.toCharArray();
        while(i < indices.length)
        {
            if(i == indices[i]) i++;
            else
            {
                swap(charr,i,indices[i]);
                swap(indices,i,indices[i]); 
            }
        }
        return String.valueOf(charr);
    }
   
    // oop nap chong toan tu
    public void swap(int[] arr ,int i,int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public void swap(char[] charr, int i, int j) 
    {
        char t = charr[i];
        charr[i] = charr[j];
        charr[j] = t;
    }
    
    
    // Tham khảo thêm Discuss: Java Simple Easy to Understand Do as Question says O(n) 
    // 1 người code IQ vô cực :))
}
