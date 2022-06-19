class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l=0, r=0, max = 0;
        while(r < s.length()){
            if(!charSet.contains(s.charAt(r))){
                //include the char in the set
                charSet.add(s.charAt(r));
                r++;
            }else{
                charSet.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max, charSet.size());
        }
        return max;
    }
}
