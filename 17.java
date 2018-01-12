class Solution {
    public List<String> letterCombinations(String digits) {
        char[] PartialChar = new char[digits.length()];
        List<String> list = new ArrayList<String>();
        if(digits.length()==0 || digits == null) return list;
        func(digits,0,PartialChar,list);
        return list;
    }
        private static final String[] MAP = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        public void func(String digits, int index, char[] PartialChar, List<String> list)
        {
            if(index == digits.length())
            {
                list.add(new String(PartialChar));
            }
            else
            {
                for (int i = 0; i < MAP[digits.charAt(index)-'0'].length(); i++)
                {
                    char c = MAP[digits.charAt(index)-'0'].charAt(i);
                    PartialChar[index] = c;
                    func(digits, index +1, PartialChar, list);
                }
            }
        }
        
        
        
    
}