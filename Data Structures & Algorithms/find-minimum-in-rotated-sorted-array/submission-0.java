class Solution {
    public int findMin(int[] nums) {
        // [3,4,5,6,1,2] 3,4,5,6,    1,2
        //while(l<h)
        //l=0,h=5, mid= 0+5/2=2 ==> nums[mid]>nums[h]==> 5>2==> l=mid+1=3
        //l=3,h=5 mid= 3+5/2=4 ==>nums[mid]<nums[h]==>1<2==> h=mid=4
        //l=3 h=4 mid= 3+4/2=3==>nums[mid]>nums[h]==> l=mid+1=4
        int l=0,h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]) l=mid+1;
            else h=mid;
        }
        return nums[h];
    }
}
