class Solution {
    public int largestRectangleArea(int[] heights) {
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
}