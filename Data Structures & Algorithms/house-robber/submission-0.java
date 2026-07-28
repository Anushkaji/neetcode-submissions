class Solution {
    public int rob(int[] nums) {
       int plus1=0, plus2=0;
       for(int i=nums.length-1; i>=0;i--){
        int cur=Math.max(nums[i]+plus2, plus1);
        plus2=plus1;
        plus1=cur;
       } 
       return plus1;
    }
}
