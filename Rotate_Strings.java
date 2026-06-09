class Solution {
    public boolean rotateString(String A, String B) {
         if(A==null||B==null)
         {
             return false;
         }
         if(A.length()!=B.length())
         {
             return false;
         }
         if(A.length()==0&&B.length()==0)
         return true;
         for(int i=0;i<A.length();i++)
         {
             if(rotateS(A,B,i))
             {
                 return true;
             }

         }return false;

     }
     private boolean rotateS(String A,String B,int rotation) {
         for (int i = 0; i < A.length(); i++) {
             if (A.charAt(i) != B.charAt((i + rotation) % B.length()))
                 return false;

         }
         return true;
     }}

class Solution {
    public boolean rotateString(String A, String B) {

        String c = A + A;
        if (c.contains(B) && A.length() == B.length()) {
            return true;

        }
        return false;

    }}

class Solution {
    public boolean rotateString(String A, String B) {

        for(int i=0;i<A.length();i++)
        {
            A=A.substring(1)+A.charAt(0);
            if(A.equals(B)) return true;
        }
        return false;

    }
}
