class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int n :nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> bucket[] = new ArrayList[nums.length+1];
        for(Integer key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null) bucket[frequency]= new ArrayList<>();
            bucket[frequency].add(key);
        }
        int ans[] = new int[k];
        int kIndex=0;
        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i] == null) continue;
            ArrayList<Integer> currList = bucket[i];
            for(int j=0; j<currList.size(); j++){
                ans[kIndex++] = currList.get(j);
                if(kIndex == k) return ans;
            }
        }
        return ans;
    }
}
