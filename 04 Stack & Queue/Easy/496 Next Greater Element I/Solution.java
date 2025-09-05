// Approach - 1 - not optimized

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums1.length; i++){
            int temp = 0;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    temp = j;
                    break;
                }
            }

            boolean found = false;

            for(int k=temp+1; k<nums2.length; k++){
                if(nums1[i]<nums2[k]){
                    stack.push(nums2[k]);
                    found = true;
                    break;
                }
            }
            if(!found){
                stack.push(-1);
            } 
        }

        // int[] arr = stack.stream().mapToInt(x -> x.intValue()).toArray();

        int[] arr = stack.stream().mapToInt(Integer::intValue).toArray();
        return arr;
        
    }
}

// Approach - 2 Optimized

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        Stack<Integer> stack = new Stack<>();

        HashMap<Integer, Integer> ngeMap = new HashMap<>();

        int n = arr.length;

        stack.push(arr[n-1]);
        ngeMap.put(arr[n-1],-1);
        

        for(int i = n-2; i>=0; i--){
            int top = stack.peek();
          
            while(!stack.isEmpty()){
                if(stack.peek()<arr[i]){
                    stack.pop();
                }else{
                    int stackNGE = stack.peek();
                    ngeMap.put(arr[i],stackNGE);
                    break;
                }
            }
            if(stack.isEmpty()){
                ngeMap.put(arr[i],-1);
            }   
            
            stack.push(arr[i]);
        }

        // int[] ans = new int[nums1.length];
        // for(int i=0; i<nums1.length; i++){
        //     ans[i] = ngeMap.get(nums1[i]);
        // }

        int[] ans = Arrays.stream(nums1)             // IntStream
                        .boxed()                     // Stream<Integer>
                        .map(ngeMap::get)            // Stream<Integer> (values from map)
                        .mapToInt(Integer::intValue) // IntStream
                        .toArray();                  // int[]
                 
        return ans;
    }
}


/*

        .boxed() → converts IntStream into a Stream<Integer>.

        .map(ngeMap::get) → looks up each value in the map.-> Method Reference
        ->Lambda Exp  .map(num -> ngeMap.get(num))

        .mapToInt(Integer::intValue) → unboxes back into an IntStream. 
        [.mapToInt(x -> x.intValue())]

        .toArray() → collects into an int[]

*/