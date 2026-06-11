import java.util.*;
class Main {
    public static int countSubstrings(String s,int k)
    {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int[] freq=new int[26];
            int distinct=0;
            for(int j=i;j<n;j++)
            {
                if(freq[s.charAt(j)-'a']==0)
                {
                    distinct++;
                }
                freq[s.charAt(j)-'a']++;
                if(distinct==k) count++;
                if(distinct>k) break;

            }
        } return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = countSubstrings(s, k);

        System.out.println("Number of substrings with exactly " + k + " distinct characters: " + result);

    }
}

import java.util.*;
class Main{
    public static int atMostK(String s,int k)
    {
        int left=0, count=0;
        int[] freq=new int[26];
        int distinct=0;
        for(int right=0;right<s.length();right++)
        {
            if(freq[s.charAt(right)-'a']==0)
            {
                distinct++;
            }
            freq[s.charAt(right)-'a']++;
            while(distinct>k)
            {
                freq[s.charAt(left)-'a']--;
                if(freq[s.charAt(left)-'a']==0)
                {
                    distinct--;
                }
                left++;
            } count+=(right-left+1);
        }
        return count;
    }

    public static int countSubstrings(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = countSubstrings(s, k);

        System.out.println("Number of substrings with exactly " + k + " distinct characters: " + result);

        sc.close();
    }
}
