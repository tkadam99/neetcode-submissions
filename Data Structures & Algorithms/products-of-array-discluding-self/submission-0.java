class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int [nums.length];

        answer[0] = 1;
        int suffix = 1;

        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        for (int j = nums.length - 1; j >=0 ; j--) {
            answer[j] = suffix * answer[j];
            suffix = nums[j] * suffix;
        }

        return answer;
    }
}  
