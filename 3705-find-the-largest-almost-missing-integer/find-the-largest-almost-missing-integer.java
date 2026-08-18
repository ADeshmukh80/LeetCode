class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int n : set) {
                mp.put(n, mp.getOrDefault(n, 0) + 1);
            }
        }
        int res = -1;
        for (int n : mp.keySet()) {
            if (mp.get(n) == 1) {
                res = Math.max(res, n);
            }
        }
        return res;
    }
}