class  MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int highestSum = nums[0]; //get first num in array
        int currentSum = nums[0]; //get first num in array
        
        for(int i = 1; i<nums.length; i++){ //loop through array
            
           // current sum is which ever is greater, currentSum + nums[i] if thats lower than nums[i] we take nums[i] as the new position where we will start summing up again.
            currentSum = Math.max(currentSum+nums[i], nums[i]); 
            
            //highest sum is between highestSum and the current Sum
           highestSum = Math.max(currentSum, highestSum);
        }
        return highestSum; // return highest sum
    }
}
