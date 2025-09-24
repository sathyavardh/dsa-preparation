// Approach - 1 Brute Force (TLE)

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                int area = Math.min(height[i],height[j])*(j-i);
                if(max<area){
                    max = area;
                }
            }
        }
        return max;
    }
}

// Approach - 2 Two Pointers (Greedy)

class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int n = height.length;
        int i=0;
        int j=n-1;  

        while(i<j){
            int area = Math.min(height[i],height[j])*(j-i);
            maxWater = Math.max(maxWater, area);
            if(height[i]<height[j]){
                ++i;
            }
            else{
                --j;
            }
        }

        return maxWater;
    }
}