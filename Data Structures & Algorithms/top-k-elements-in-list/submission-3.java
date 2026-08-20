class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}
