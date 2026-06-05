class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }}
//optimal
class Solution {
    public String longestCommonPrefix(String[] strs) {
         Arrays.sort(str);
         String str1=str[0];
         String str2=str[str.length-1];
         int index=0;
         while(index<str1.length())
         {
             if(str1.charAt(index)==str2.charAt(index))
             {
                 index++;
             }else
             {
                 break;
             }
         }
         return index==0?"":str1.substring(0,index);
}}
//brute
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        for(int i=0;i<strs[0].length();i++)
        {
            char ch=strs[0].charAt(i);
            for(String word: strs)
            {
                if(i>=word.length()|| word.charAt(i)!=ch)
                {
                    return prefix;
                }
            }
            prefix=prefix+ch;
        }
        return prefix;

    }
}