class Solution{  
// Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(arr.length,-1));
        
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans.set(st.pop(),arr[i]);
                
            }
            st.push(i);
        }
        
        return ans;
        
    }
}