class Solution {
    public int[] runningSum(int[] nums) {
        int [] res = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = 0;
            for(int j = 0; j <= i; j++)
            {
                sum += nums[j];
            }
            res[i] = sum;
        }
        return res;
    }
}