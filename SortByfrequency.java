class Solution {
    public String frequencySort(String s) {

        // Step 1: Count frequency
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Create buckets
        StringBuilder[] buckets = new StringBuilder[s.length() + 1];

        for (int i = 0; i < 128; i++) {
            int f = freq[i];
            if (f > 0) {
                if (buckets[f] == null) {
                    buckets[f] = new StringBuilder();
                }
                buckets[f].append((char) i);
            }
        }

        // Step 3: Build result
        StringBuilder result = new StringBuilder();

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i].toString().toCharArray()) {
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}
//brute

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // brute counting
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                int count = 0;

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) count++;
                }

                map.put(ch, count);
            }
        }

        // sort by frequency
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // build result
        StringBuilder res = new StringBuilder();
        for (char c : list) {
            int freq = map.get(c);
            while (freq-- > 0) {
                res.append(c);
            }
        }

        return res.toString();
    }
}

//better
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // sort characters
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // build result
        StringBuilder res = new StringBuilder();
        for (char c : list) {
            int freq = map.get(c);
            while (freq-- > 0) {
                res.append(c);
            }
        }

        return res.toString();
    }
}