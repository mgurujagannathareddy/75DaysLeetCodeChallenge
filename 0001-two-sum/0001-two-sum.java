class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < n; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i)
            {
                return new int[] {i, map.get(compliment)};
            } 
        }
        return new int[] {};
    }
}