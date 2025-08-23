class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: when strs is null or empty
        if(strs==null || strs.length==0)    return new ArrayList<>();

        Map<String, List<String>> map=new HashMap<>();
        for(String s: strs)
        {
            char[] frequencyCount=new char[26];
            for(char c: s.toCharArray())
            {
                frequencyCount[c-'a']++;
            }
            String k=String.valueOf(frequencyCount);
            if(!map.containsKey(k))  map.put(k, new ArrayList<>());
            map.get(k).add(s);
        }

        return new ArrayList(map.values());
    }
}

// Time Complexity:- O(N*k)
// Space Complexity:- O(N*k)
