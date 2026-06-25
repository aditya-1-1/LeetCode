class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0;
        int maxi = INT_MIN;
        for(int i : nums){
            if(sum < 0) sum = 0;
            sum += i;
            maxi = max(sum, maxi);
        }
        return maxi;
    }
};