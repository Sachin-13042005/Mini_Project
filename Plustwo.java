class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        String s;
        int b[]=null,a[]=null;
        for(int i=n-1;i<n;i++)
        {
            if(digits[i]<9)
            {
                a=new int[digits.length];
                digits[i]=digits[i]+1;
                System.arraycopy(digits,0,a,0,digits.length);
                
            }
            else if(n==1)
            {
               s=String.valueOf(digits[i]+1); 
               a=new int[(digits.length+1)];
               for(int k=0;k<s.length();k++)
                {
                    char c=s.charAt(k);
                    a[k]=c-'0';
                }
            }    
                      
                        
            else
            {
                s=String.valueOf(digits[i]+1);
                b=new int[s.length()];
                a=new int[(digits.length+s.length())];
                for(int k=0;k<s.length();k++)
                {
                    char c=s.charAt(k);
                    b[k]=c-'0';
                }
            
         
                System.arraycopy(digits,0,a,0,digits.length);
                System.arraycopy(b,0,a,digits.length,b.length);
                
            }
        }
        return a;
    
    
}

}