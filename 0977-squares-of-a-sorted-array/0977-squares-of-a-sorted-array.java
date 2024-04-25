class Solution {
    public int[] sortedSquares(int[] nums) {
        int lengthcheck = nums.length;
        for(int i=0;i<lengthcheck; i++)
        {
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}