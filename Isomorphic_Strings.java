class Solution {
    public boolean isIsomorphic(String s, String t) {


        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (used.contains(c2)) return false;
                map.put(c1, c2);
                used.add(c2);

            }
        }
        return true;

    }}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1[c1] != map2[c2]) return false;
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        return true;
    }}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1=new int[256];
        int[] map2=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(map1[c1]!=map2[c2]) return false;
            map1[c1]=i+1;
            map2[c2]=i+1;
        }
        return true;
    }
}


