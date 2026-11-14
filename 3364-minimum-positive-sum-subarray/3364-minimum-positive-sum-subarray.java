class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE, sum = 0;

        for(int i=0; i<nums.size(); i++){
            sum = 0;

            for(int j=i; j<nums.size(); j++){
                if(j-i+1 >= l && j-i+1 <= r){
                    sum = 0;

                    for(int num: nums.subList(i,j+1)){
                        sum += num;
                    }

                    if(sum<minSum && sum>0)
                        minSum = sum; 
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}