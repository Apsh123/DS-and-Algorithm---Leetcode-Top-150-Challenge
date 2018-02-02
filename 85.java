class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)return 0;
        int temp[] = new int[matrix[0].length];
        
        int maxArea = 0;
        int area = 0;
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < temp.length; j++){
                if(matrix[i][j] == '0'){
                    temp[j] = 0;
                }else{
                    temp[j] += matrix[i][j]-'0';
                }
               
            }
             // for(int l =0 ; l < temp.length; l++){
             //        System.out.println(temp[l]);
             //    }
            Stack<Integer> stack = new Stack<Integer>();
            
            int k;
            for(k =0; k < temp.length;){
                if(stack.isEmpty() || temp[stack.peek()] <= temp[k]){
                    stack.push(k++);
                }
                else{
                    int top = stack.pop();
                    if(stack.isEmpty()){
                        area = temp[top] * k;
                    }else{
                        area = temp[top] * (k-stack.peek()-1);
                 }
                    if (area > maxArea){
                        maxArea = area;                
                    }
                             
                }
                
            }
            while(!stack.isEmpty()){
            int top = stack.pop();
                if(stack.isEmpty()){
                    area = temp[top] * k;
                }else{
                    area = temp[top] * (k-stack.peek()-1);
                }
                            
                if (area > maxArea){
                    maxArea = area;
            }
        }
        
        
        
        }
        return maxArea;
    }
}