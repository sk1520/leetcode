
class MaxAreaArraySolution {
    public int maxArea(int[] height) {
        
        int currentArea =0; // keep track of the current area
        int maxArea = 0; // keep track of max area
      
        int left =0; //left pointing index
        int right = height.length -1; //right pointing index starting from the end
       
        while(left < right){ //while left index is lower than right we loop
            
            int minHeight = Math.min(height[left],height[right]); //keep track of height is smaller left vs right
            
            //current area = minimum height of two indexes * left index-right index
            currentArea = minHeight * (right-left);
            
            //check if maxArea is bigger than current Area
            if(maxArea < currentArea)
                maxArea = currentArea;
            
            //move index left if its lower otherwise move right index 
            if(height[left] < height[right])
                left++;
            else 
                right--;
            
        }
        
        return maxArea; //return max area we found
        
    }
    
  
}
