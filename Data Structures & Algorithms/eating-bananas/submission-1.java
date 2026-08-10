class Solution {
    public int minEatingSpeed(int[] piles, int hour) {
        int l=1,h=0;
        for(int pile:piles){
            h=Math.max(h,pile);
        }
        while(l<h){
            int mid= l+(h-l)/2;// mid= 4/2=2
            int hrs=0;
            for(int pile:piles){
                hrs+=(pile+mid-1)/mid;
            }
            if(hrs<=hour){
                h=mid;
            }
            else l=mid+1;

        }
        return l;
    }
}
