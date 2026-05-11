class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length-1;
        if(l<0){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                while(l>=0 && nums[l]==val){
                    l--;
                }
                if (l>i){
                    nums[i]=nums[l];
                    nums[l]=val;
                }
                else{
                    return l+1;
                }
            }
        }
        return l+1;

    }
}