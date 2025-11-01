class Solution {
    public static int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i=0; i<=n; i++){
            int currHeight = (i==n)?0:heights[i];
            while(!stack.isEmpty() && currHeight<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty()?0:stack.peek()+1;
                int width = right-left;
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static int allOnes(char[][] arr, int m, int n){
        int[][] newArr = new int[m][n];

        for(int i=0; i<m; i++){  // this for all the rows array heights
            for(int j=0; j<n; j++){  // this for all the rows array heights
                newArr[i][j] = arr[i][j] - '0';
            }
        }

        int maxArea = 0;
        int[] temp = null;

        for(int i=m-1; i>=0; i--){
            temp = new int[n];
            for(int j=0; j<n; j++){
                int count = 0;
                for(int k=i; k>=0; k--){
                    if(newArr[k][j]==1){
                        count++;
                    }else{
                        break;
                    }
                }
                temp[j] = count;
            }
            // temp = [4,0,0,3,0], temp = [3,1,3,2,2]
            maxArea = Math.max(maxArea,largestRectangleArea(temp));
            temp = null;
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        return allOnes(matrix, matrix.length, matrix[0].length);
    }
}