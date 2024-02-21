class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i<n; i++){
           if(matrix[i][m-1] >= target){ 
            System.out.println("target :"+target);
           for(int j=0; j<m; j++){
               if(matrix[i][j] == target)
                   return true;
               
           }
           }
        }
            return false;
        
        
    }
}