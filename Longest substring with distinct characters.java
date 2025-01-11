class Solution {
    public int longestUniqueSubstr(String s) {
        int n = s.length();
        int[] ans = new int[26];
        int count = 1;
        int i = 0;
        int j = 0;
        while(j < n){
            ans[s.charAt(j)-'a']++;
            while(ans[s.charAt(j)-'a'] > 1 && i < j){
                ans[s.charAt(i)-'a']--;
                i++;
            }
            count = Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}
