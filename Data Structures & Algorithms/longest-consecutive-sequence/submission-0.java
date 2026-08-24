class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap <Integer, Integer> tpp = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            tpp.put(nums[i], 1);
        }
        int longest = 0;
        int currentStreak = 0;
        Integer lastKey = null;

        for (int key : tpp.keySet()) {
            if ( lastKey != null && key == lastKey + 1) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            longest = Math.max(longest, currentStreak);
            lastKey = key;
        }

        return longest;
    }
}
