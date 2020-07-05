class SortColors {
    public void sortColors(int[] nums) {
        
        //counters
        int red=0;
        int white=0;
        int blue=0;
        
        //loop through array
        for(int i =0; i< nums.length; i++){
            if(nums[i] == 0) // check for color  0= red 1 = white 2 = blue
                red++;
            else if(nums[i]==1)
                white++;
            else
                blue++;
        }
        
        //loop through array again this time putting colors in right place
        for(int i=0; i<nums.length; i++){
            if(i < red) // if index is less then red count then we place the red colors in that position
                nums[i]=0;
            //if index is more than red count but less than combined of red and white then we place our white color in that position
            else if(i < red+white){
                nums[i]=1;
            }
            else  //all other positions are blue
                nums[i]=2;
            
            }
    }
}
