class Solution {
    public int maxArea(int[] h) {
        int l=0,r= h.length-1, res=0;
        while(l<r)
        {
            int area= Math.min(h[l],h[r])*(r-l);
            res= Math.max(area,res);
            if(h[l]<=h[r])
            {
                l++;
            }
            else 
            {
                r--;
            }
        }
        return res;
    }
}
