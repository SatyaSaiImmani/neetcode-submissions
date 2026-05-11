class Solution {
    public boolean areAnagrams(String str1, String str2){
        int[] track = new int[26];
        int n = str1.length();
        for(int i=0; i<n; i++){
            track[str1.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++){

            if(track[str2.charAt(i)-'a']<=0){
                return false;
            }
            else{
                track[str2.charAt(i)-'a']--;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagramsSameLength(List<String> strs){
        if(strs.size() == 0){
            return new ArrayList<List<String>>();
        }
        List<String> pure = new ArrayList<String>();
        List<String> impure = new ArrayList<String>();

        for(String str: strs){
            if (pure.size()!=0 && !areAnagrams(pure.get(0), str)){
                impure.add(str);
            }
            else{
                pure.add(str);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        result.add(pure);
        for(List<String> analist: groupAnagramsSameLength(impure)){
            result.add(analist);
        }
        return result;

    }

    public List<List<String>> divideGroups(ArrayList<String> strs){
        List<List<String>> unprocessed = new ArrayList<List<String>>();
        int n = strs.size();
        HashMap<Integer, ArrayList<String>> track = new HashMap<>();
        for(int i=0; i<n; i++){
            int l = strs.get(i).length();
            if(!track.containsKey(l)){
                track.put(l, new ArrayList<String>());
            }
            track.get(l).add(strs.get(i));
        }
        for(int key: track.keySet()){
            unprocessed.add(track.get(key));
        }
        return unprocessed;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> strings = new ArrayList<String>();
        for(String x: strs){
            strings.add(x);
        }
        List<List<String>> unprocessed = divideGroups(strings);
        List<List<String>> processed = new ArrayList<List<String>>();

        for(List<String> unlist: unprocessed){
            for(List<String> proclist: groupAnagramsSameLength(unlist)){
                processed.add(proclist);
            }
        }

        return processed;
    }
}


