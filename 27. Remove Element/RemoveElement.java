class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length; // get the length
        
        for(int i =0; i< length; i++){ // loop through the arrays
            if(nums[i] == val){ //check array for num value
                nums[i] = nums[length-1]; // replace the ith position with length-1 value
                i--; // decrement if we found a match
                length--; // decrement the length
            }
                
        }
        return length; //return the length of new array
    }
}
