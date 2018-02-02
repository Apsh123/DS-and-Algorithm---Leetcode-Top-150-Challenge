class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        char[] wd = word.toCharArray();
        
        visited = new boolean[board.length][board[0].length];
        
        for(int i =0; i < board.length; i++){
            for(int j =0; j < board[0].length; j++){
                if(validate(board,wd,i,j,0))return true;
            }
            
        }
        return false;
        
    }
    
    public boolean validate(char[][] board, char[] wd, int i , int j, int index){
        if(index == wd.length)return true;
        
        if(i <0 || j <0 || i == board.length || j == board[0].length || board[i][j] != wd[index] || visited[i][j])return false;
        
        visited[i][j] = true;
        if(validate(board, wd, i, j+1, index+1) || validate(board, wd, i, j-1, index+1) || 
            validate(board, wd, i+1, j, index+1) || validate(board, wd, i-1, j, index+1)) return true;;
        visited[i][j] = false;
        return false;
    }
}