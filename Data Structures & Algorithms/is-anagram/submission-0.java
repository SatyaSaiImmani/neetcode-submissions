class Solution {
    public boolean isAnagram(String s, String t) {
        int[] pos = new int[26];
        s.chars().forEach(ch -> pos[ch-'a']++);
        t.chars().forEach(ch -> pos[ch-'a']--);
        for(int i: pos){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
