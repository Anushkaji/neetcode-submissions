class Solution {
    public int jump(int[] nums) {
        int coverage=0, lastjump=0, jump=0, destination=nums.length-1;
        if(nums.length==1) return 0;
        for(int i=0; i<nums.length-1;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastjump){
                jump++;
                lastjump=coverage;
            }
           
        }
        return jump;
    }
}
