// Approach - 1 Brute Force (2 Pointers)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

//Approach - 2 HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<n; i++){
            int pairToFind = target - nums[i];
            if(map.get(pairToFind) && map.get(pairToFind)!=i){
                return new int[] {i, map.get(pairToFind)};
            }
        }
        return new int[]{};
        
    }
}