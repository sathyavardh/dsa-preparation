// Approach - 1 Brute Force
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

// Approach - 2 Binary Search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}