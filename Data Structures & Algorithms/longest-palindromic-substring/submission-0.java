class Solution {
    public String longestPalindrome(String s) {
        String result="";
        for(int i=0; i<s.length();i++){
            String odd= expand(s,i,i);
            if(odd.length()>=result.length()){
                result=odd;
            }
            String even= expand(s,i,i+1);
            if(even.length()>=result.length()){
                result=even;
            }
        }
        return result;

    }

    public String expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--; right++;
        }
         return s.substring(left+1,right);
          // left+1 return because we have already are at i+1 index checked
            // that and found its not plaindrome so we will move 1 back and return
            // left +1 
    }
}
