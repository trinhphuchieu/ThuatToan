class Solution 
{


// Làm được 

    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        if(mat[0].length*mat.length  != r*c) return mt;
        int[][] mt = new int[r][c];
        int[] arr = new int[mat[0].length*mat.length];
        int count = 0;
        for(int i = 0; i < mat.length;i++)
        {
            for(int y = 0 ; y < mat[0].length; y++)
            {
                    arr[count] = mat[i][y];
                    count+=1;                        
            }
        }
        count= 0;
        for(int i = 0 ; i < r ; i ++)
        {
        	for(int y = 0 ;y < c; y++)
        	{
                 mt[i][y] = arr[count];
                 count+=1;
        	}
              
            
        }
       
        return mat;
    }


// Tham Khảo

public int[][] matrixReshape(int[][] nums, int r, int c) 
{
    int n = nums.length, m = nums[0].length;
    if (r*c != n*m) return nums;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = nums[i/m][i%m]; // công thức 
    return res;
}

}