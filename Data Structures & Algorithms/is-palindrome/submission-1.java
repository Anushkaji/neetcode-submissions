class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char ch :s.toCharArray())
        {
            if(Character.isLetter(ch)|| Character.isDigit(ch))
            str+=ch;
        }
        str= str.toLowerCase();
        int a=0, b= str.length()-1;
        while(a<b){
         if(str.charAt(a)!= str.charAt(b))
         return false;
         a++; b--;
        }
        return true;
    }
}
