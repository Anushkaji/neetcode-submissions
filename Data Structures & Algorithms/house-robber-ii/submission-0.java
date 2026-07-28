class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(
            helper(nums,0,nums.length-2),
            helper(nums,1,nums.length-1)
        );
        }
        private int helper(int[] nums, int start, int end){
            int plus1=0, plus2=0;
            for(int i=end; i>=start;i--){
                int cur= Math.max(nums[i]+plus2,plus1);
                plus2=plus1;
                plus1=cur;
            }
            return plus1;
        }
    }

   