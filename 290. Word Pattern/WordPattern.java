class WordPattern {
    /*  
    input 
    pattern = "abba" 
    str     = "dog cat cat dog"
*/
    public boolean wordPattern(String pattern, String str) {
        
        String [] strArray = str.split("\\s+"); // split str string into each word and place it into an array
        
        Map<Character, String> map = new HashMap<>(); //create new hashmap to map pattern letters with words
        
        if(strArray.length != pattern.length()) //check if both pattern character length matches how many words there are
            return false;
        
        
        for(int i = 0 ; i< strArray.length; i++){ //loop through each word
            
            Character c = pattern.charAt(i); // get the character and see if it matches to corresponding word
            
            if(map.containsKey(c)){ //first check if the map contains the letter character 
                if(!map.get(c).equals(strArray[i])) //if it does we check if the value mapped to the character equals to the word we are checking
                    return false; //if they don't match return false right away.
            }
            else{ //if our map doesn't contain the character 
                if(map.containsValue(strArray[i])) //we check if the value exists in the map, if it does that means the character we're checking won't match the word we're checking.
                    return false;
                
                map.put(c, strArray[i]); //if the key character doesn't exist and the value also doesn't exist in our map we both put them in.
                    
            }
        }
        return true; //we return true if every check has been completed, and that means pattern string matches with str string 
        
    }
}
