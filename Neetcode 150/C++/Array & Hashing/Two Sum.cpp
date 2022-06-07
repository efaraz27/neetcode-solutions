class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> mp;
        int n = nums.size();
        for (int i = 0; i < n; i++)
        {
            int remain = target - nums[i];
            if (mp.find(remain) != mp.end())
            {
                return {mp[remain], i};
            }
            mp.insert({nums[i], i});
        }
        return {};
    }
};

// T.c ==> O(n)
// S.c ==> O(n)
