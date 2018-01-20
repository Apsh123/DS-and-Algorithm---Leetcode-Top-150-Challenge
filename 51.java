class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] matrix = new char[n][n];
        for(int i =0; i< n;i++){
            for(int j =0; j < n; j++){
                matrix[i][j] = '.';
            }
        }
        NQueens(matrix, 0, list);
        return list;
    }
    
    public void NQueens(char[][] matrix, int row, List<List<String>> list){
        
        if(row == matrix.length){
            list.add(insert(matrix));
            return;
            
        }
        
        for(int col = 0; col < matrix.length; col ++){
            if(validate(matrix, row, col)){
                matrix[row][col] ='Q';
                NQueens(matrix, row+1, list);
                matrix[row][col] ='.';
            }
        }
    
        //commented code is filling the matrix column wise
        
//         if(col == matrix.length){
//             list.add(insert(matrix));
//             return;
//         }
        
//        for(int i =0; i < matrix.length; i++){
//             if(validate(matrix, i, col)){
//                 matrix[i][col] = 'Q';
//                 NQueens(matrix, col +1, list);
//                 matrix[i][col] ='.';
//             }
//         }
        
        
    }
    public boolean validate(char[][] matrix, int row, int col){
        for(int j =0; j < matrix.length; j++){
            for( int i =0; i < row; i++){
                if(matrix[i][j] == 'Q' &&(i - j== row - col || i + j == row + col || col == j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    // public boolean validate(char[][] matrix, int row, int col){
    //     for(int i =0; i < matrix.length; i++){
    //         for( int j =0; j< col; j++){
    //             if(matrix[i][j] == 'Q' &&(i - j== row - col || i + j == row + col || row == i)){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    
    
    public List<String> insert(char[][] matrix){
        List<String> ls = new ArrayList<>();
        for(int i =0; i < matrix.length; i++){
            String str = new String(matrix[i]);
            ls.add(str);
        }
        
        return ls;
    }
}