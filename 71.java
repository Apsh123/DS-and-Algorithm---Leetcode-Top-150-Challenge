class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> s1 = new Stack<String>();
        Set<String> skip = new HashSet<>();
        skip.add("");
        skip.add("..");
        skip.add(".");
        
        for(String dir: path.split("/"))
        {
            if(dir.equals("..") && !s1.isEmpty())s1.pop();
            else if(!skip.contains(dir))s1.push(dir);
        }
        
        String res = "";
        for(String dir: s1)
        {
            res += "/"+ dir;
        }
        return res.isEmpty()? "/" : res;
    }
}