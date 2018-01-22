class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if(matrix.length ==0) return res;
        
        int rowTop = 0;
        int colMax = matrix[0].length-1;
        int rowBottom = matrix.length-1;
        int colMin= 0;
        
        
        
        while(rowTop <= rowBottom && colMin <= colMax){
            for(int i = colMin; i <= colMax; i++){
                res.add(matrix[rowTop][i]);
            }
            rowTop++;
            
        
        
       // while(rowTop < rowBottom && colMin < colMax){
            for(int i =rowTop; i <= rowBottom; i++){
                res.add(matrix[i][colMax]);
            }
            colMax--;
       // }
        
        if(rowBottom >= rowTop){
            for(int i = colMax; i >= colMin; i--){
                res.add(matrix[rowBottom][i]);
            }
        }
        rowBottom --;
            
        if(colMin <= colMax){
            for(int i = rowBottom; i >= rowTop; i--){
                res.add(matrix[i][colMin]);
            }
        }
        colMin++;
            
        }
        return res;
    }
}