class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }

        // int[] count = new int[26];

        // // Loop through string s and increment character counts
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     count[ch - 97]++;
        // }

        // // Loop through string t and decrement character counts
        // for (int i = 0; i < t.length(); i++) {
        //     char ch = t.charAt(i);
        //     count[ch - 97]--;
        // }

        // // Check if all counts are zero
        // for (int i = 0; i < count.length; i++) {
        //     if (count[i] != 0) {
        //         return false;
        //     }
        // }

        // return true;
    }}

        class Solution {
            public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         char[] a=s.toCharArray();
         char[] b=t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
        return Arrays.equals(a,b);}}

class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()) return false;
         Map<Character,Integer> map=new HashMap<>();
         for(char c:s.toCharArray())
         {
             map.put(c,map.getOrDefault(c,0)+1);
         }
         for(char c:t.toCharArray())
         {
             if(!map.containsKey(c)) return false;
             map.put(c,map.get(c)-1);

         }
         for(int val: map.values())
         {
             if(val!=0) return false;
         }
 return true; }}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count=new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;

        }
        for(int num: count)
        {
            if(num!=0) return false;
        }
        return true;
    }
}
