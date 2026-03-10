Group Anagrams
Solved 
Medium
Topics
Company Tags
Hints
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean [] visited = new boolean [strs.length];

        for(int i = 0; i < strs.length; i++){
            if(visited[i]){
               continue;
            }

            List<String> group = new ArrayList<>();
            char[] sortedI = strs[i].toCharArray();
            Arrays.sort(sortedI);
            group.add(strs[i]);

            for(int j = i + 1; j< strs.length; j++){

                char[] sortedJ = strs[j].toCharArray();
                Arrays.sort(sortedJ);

                if(Arrays.equals(sortedI, sortedJ)){
                   group.add(strs[j]);
                   visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }
}