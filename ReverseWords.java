public class Solution {
    public String reverseWords(String s) {

        s=s.trim();
         String[] words=s.split("\\s+");
         String result="";
         for(int i=words.length-1;i>=0;i--)
         {
             result+=words[i];
             if(i!=0) result+=" ";
         }
         return result;


    }
}

public class Solution {
    public String reverseWords(String s) {

        s=s.trim();
        String[] words=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();

    }
    }

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, j + 1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }}