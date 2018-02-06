

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Index pIndex = new Index();
        pIndex.index = postorder.length-1;
        
        return treeBuild(inorder, postorder, pIndex, 0 , inorder.length-1);
    }
    
    public TreeNode treeBuild(int[] in, int[] pos,  Index pIndex,  int inStart, int inEnd){
        if(inStart > inEnd)return null;
        
        TreeNode tNode = new TreeNode(pos[pIndex.index--]);
        
        if(inStart == inEnd) return tNode;
        
        int inIndex = search(in, inStart, inEnd, tNode.val);
        
        tNode.right = treeBuild(in, pos, pIndex , inIndex +1, inEnd);
        tNode.left = treeBuild(in, pos, pIndex , inStart, inIndex -1);
        
        return tNode;
    }
    
    public int search(int[] in, int start, int end, int val){
        int i;
        for(i = start; i < end; i++){
            if(in[i] == val)return i;
        }
        return i;
    }
}

class Index{
    int index;
}
