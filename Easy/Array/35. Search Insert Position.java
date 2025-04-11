class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                output = i;
                break;
            } else if(i == nums.length - 1){
                output = nums.length;
            }
        }
        return output;
    }
}