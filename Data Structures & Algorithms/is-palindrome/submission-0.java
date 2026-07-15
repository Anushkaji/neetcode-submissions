class Solution {
    public boolean isPalindrome(String s) {
        String str= "";
        for (char c: s.toCharArray())
        {
            if(Character.isDigit(c)||Character.isLetter(c))
            {
                str+=c;
            }
        }
        str= str.toLowerCase();
         int a_pointer=0, b_pointer= str.length()-1;
         while(a_pointer<= b_pointer)
         {
            if(str.charAt(a_pointer)!= str.charAt(b_pointer))
            {
                return false;
            }
            a_pointer++; b_pointer--;
         }
         return true;
    }
}
