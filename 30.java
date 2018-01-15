class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        Map<String, Integer> count = new HashMap <String, Integer>();
        for(String word: words){
            count.put(word, count.getOrDefault(word,0) +1);
        }
        
        List<Integer> indexes = new ArrayList<Integer>();
        int n = s.length(); int num = words.length; int len = words[0].length();
        for(int i =0; i < n- num*len +1; i++){
            Map<String, Integer> seen = new HashMap<String, Integer>();
            
            int j =0;
            while(j < num){
                String word = s.substring(i + j*len, i +(j+1)*len);
                if(count.containsKey(word)){
                    seen.put(word, seen.getOrDefault(word,0) + 1);
                    if(seen.get(word) > count.get(word)){
                        break;
                    }
                }else{
                        break;
                    }
            
                j++;
            }
            if(j==num){
                indexes.add(i);
            }
        }
        return indexes;
    }
}