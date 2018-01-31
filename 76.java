        int start = 0;
        int start_index = -1;
        int min_length = Integer.MAX_VALUE;
        //System.out.println(min_length);
        
        for(int i = 0; i < t.length(); i++)
        {
            hash_pat[t.charAt(i)]++;
        }
        
        int count = 0;
        for (int j =0; j< s.length(); j++)
        {
            hash_str[s.charAt(j)]++;
            
            if(hash_pat[s.charAt(j)] != 0 && hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)])count ++;
            // System.out.println(count);
            if(count == len2)
            {
                while(hash_pat[s.charAt(start)] == 0 || hash_str[s.charAt(start)] > hash_pat[s.charAt(start)])
                {
                    if(hash_str[s.charAt(start)] > hash_pat[s.charAt(start)]) 
                    {
                        hash_str[s.charAt(start)]--;
                    }
                    start++;
                }
            
            
                int len_window = j -start +1;
               // System.out.println(len_window);
                if(min_length > len_window)
                {
                    min_length = len_window;
                    start_index = start;
                }
            }
            
        }
        if(start_index == -1)
        {
            //System.out.println("coz of -1");
            return "";
        }
        
        return s.substring(start_index, start_index+min_length);
        
    }
}