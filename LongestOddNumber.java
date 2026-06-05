class Solution {
    public String largestOddNumber(String num) {
        int len = num.length() - 1;
        while (len >= 0) {
            int d = num.charAt(len) - '0';
            if (d % 2 != 0) {
                return num.substring(0, len + 1);
            }
            len--;
        }
        return "";
    }}
        //optimal approach
        class Solution {
            public String largestOddNumber(String num) {
                int n = num.length();

                for (int i = n - 1; i >= 0; i--) {
                    if ((num.charAt(i) - '0') % 2 != 0) {
                        return num.substring(0, i + 1);
                    }
                }
                return "";
            }}
//-------------brute approach
        class Solution {
            public String largestOddNumber(String num) {
        String result = "";
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String sub=num.substring(i,j+1);
                char last=sub.charAt(sub.length()-1);
                if((last-'0')%2!=0)
                {
                    if(sub.length()>result.length())
                    {
                        result=sub;
                    }
                }
            }
        }


        return result;
    }
}