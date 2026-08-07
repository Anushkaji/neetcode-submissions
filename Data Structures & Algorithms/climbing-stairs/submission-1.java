class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int prev1=2, prev2=1;// if i am standing on stairs 1 i have 2 ways to go up
        //i.e 1+1 or 2=2 
        //similarly if i am on stairs 2 i have only one way to go up
        // i.e. 2=2
        for(int i=3; i<=n;i++){
            int cur= prev1+ prev2;
            prev2=prev1;
            prev1=cur;
            
        }
        return prev1;
    }
}
