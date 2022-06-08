class Solution {
    public int[] productExceptSelf(int[] nums) {
        int products[] = new int[nums.length];
        int currPrefix = 1;
        for(int i=0; i<nums.length; i++){
            products[i] = currPrefix;
            currPrefix *= nums[i];
        }
        int currPostfix = 1;
        for(int i=nums.length-1; i>=0; i--){
            products[i] *= currPostfix;
            currPostfix *= nums[i];
        }
        return products;
    }
}
