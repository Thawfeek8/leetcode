class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans = Integer.MAX_VALUE;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[l]<=nums[mid]){
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                h = mid-1;
            }
        }
        return ans;
        
    }
}