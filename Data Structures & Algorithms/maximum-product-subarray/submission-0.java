class Solution {
    public int maxProduct(int[] nums) {
        int p=0,s=0, n=nums.length;
        int res=nums[0];
        for(int i=0;i<n;i++){
            p=nums[i]*(p==0?1:p);
            s=nums[n-1-i]*(s==0?1:s);
            res= Math.max(res,Math.max(p,s));
        }
        return res;
    }
}
