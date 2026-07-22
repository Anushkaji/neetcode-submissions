class Solution {
    public int trap(int[] h) {
        int l=0, r= h.length-1, res=0;
        int lm= h[l] , rm= h[r];
        while(l<r)
        {
            if(lm<rm)
            {
                l++;
                lm= Math.max(lm,h[l]);
                res+= lm-h[l];
            }
            else {
                r--;
                rm= Math.max(rm, h[r]);
                res+= rm-h[r];
            }
        }
        return res;




    }
}
