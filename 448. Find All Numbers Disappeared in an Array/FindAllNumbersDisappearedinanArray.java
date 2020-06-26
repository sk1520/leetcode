class FindAllNumbersDisappearedinanArray
 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); //create a hash set which doesn't take any duplicates
        
        for(int i =1 ; i<=nums.length; i++)
            set.add(i); //populate hashset with numbers 1 - lenght of array
        
        for(Integer x : nums) //loop through given array
            set.remove(x); //remove numbers that the array has leaving only numbers the array doesn't have
  
        return new ArrayList<Integer>(set); //return arraylist of numbers that were left in the set.
    }
}
