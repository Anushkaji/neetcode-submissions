class Solution {
    public int numDecodings(String s) {
        int dp=0, dp1=1, dp2=0;
        // we havent started yet so waus to decode cur i.e. dp=0
        // but we are standing at last so it is certain there is 1 
        // way we would have decoded everything that why we are at last
        // so dp1=1 like in climbing stairs if we are standing at last, ways
        // to reach top is just 1 jump
        // dp2=0 because if we are at last dp2 does not exist so 
        // dp2=0 as a placeholder
        for(int i= s.length()-1; i>=0; i--){
            if(s.charAt(i)=='0') dp=0;
            else{ dp=dp1;
            // think of this as an approach
            // in this approach we will consider 1->2->1 not 1->12
            // so ways to decode current is i+1= dp1
            if(i+1<s.length()&&(s.charAt(i)=='1' ||s.charAt(i)=='2' && s.charAt(i+1)<'7')){
                dp+=dp2;
                // we are considering 1->12 so 2 numbers are considered together
                //so where i am plus next numbers are considered together so cur val + dp2

            }
            }
            dp2=dp1;
            dp1=dp;
            dp=0;

        }
        return dp1;
        // return dp1 because that has the latest ways to decode
        // if i start from end of string and reach 0 index that means 
        // i have to find the ways to decode whole string from 0 index 
        //i.e. find ways to decode 121 not 1->2->1 or 1->21 (that is already calucated)
        // so dp1 has all the latest ways to calculate so return dp1
    }
}
