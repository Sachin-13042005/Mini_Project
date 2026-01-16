class Solution {
    public int majorityElement(int[] n) {
        int c=0;
        for(int i=0;i<n.length-1;i++)
        {
            int m=0;
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]==n[j])
                {
                    m++;
                    if(m>=n.length/2)
                    {
                        c=i;
                        break;
                    }

                }
            }
           
        }
        return n[c];
    }
}