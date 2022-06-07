class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> compMap = new HashMap<>();
        int ans[] = {-1,-1};
        for(int i=0; i<nums.length; i++){
            if(compMap.containsKey(nums[i])){
                ans[0] = compMap.get(nums[i]);
                ans[1] = i;
                break;
            }
            int complement = target-nums[i];
            compMap.put(complement, i);
        }
        return ans;
    }
}
