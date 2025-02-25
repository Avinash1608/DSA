class Solution {

int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int element=st.peek();
                st.pop();
                
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                
                maxArea=Math.max(maxArea,arr[element]*(nse-pse-1));
            }
        }
        
        //elements leftover
        
        while(!st.isEmpty()){
            int element=st.peek();
                st.pop();
                
                int nse=n;
                int pse=st.isEmpty()?-1:st.peek();
                
                maxArea=Math.max(maxArea,arr[element]*(nse-pse-1));
            
        }
        
        return maxArea;