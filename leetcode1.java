class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) 
    {
        for(int i=0;i<x;i++)
        {
            if(n1[i]==0)
            {
                for(int j=i;j<x-1;j++)
                {
                    n1[j]=n1[j+1];
                }
                i--;
                x--;
            }
        }
        for(int i=0;i<y;i++)
        {
            if(n2[i]==0)
            {
                for(int j=i;j<y-1;j++)
                {
                    n2[j]=n2[j+1];
                }
                i--;
                y--;
            }
        }
        Arrays.sort(n1);
        Arrays.sort(n2);
        System.arraycopy(n2,0,n1,x,y);
        for(int i=0;i<n1.length;i++)
        {
            System.out.print(n1[i]+" ");
        }
        
    }
}