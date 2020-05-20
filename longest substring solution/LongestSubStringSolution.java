class LongestSubStringSolution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubCount =0; // longestSubCount will hold longest sub sequence and is returned
        Map<Character, Integer> map = new HashMap<>();// map to count characters, and what positions they are found in
        for (int i = 0 , j= 0; i < s.length(); i++){ // loop through the string, j holds repeating characters position
            char currentChar = s.charAt(i);
            
            if(map.containsKey(currentChar)){
                j = Math.max(map.get(currentChar), j); //store previous repeating characters position in the string
                 System.out.println(i-j+1);
            }
            map.put(currentChar, i+1);//put character in map and its position in the string
            longestSubCount = Math.max(longestSubCount, i-j+1); //take current index minus previous characters position and add 1 to get a subsequence from a repeating character to the repeating character and check if thats longer than the substring  before hitting repeating character
        }
        return longestSubCount;
        
    }
}
