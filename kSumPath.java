class Solution {
    
    static int countPath(Node root,int currSum,int k,Map<Integer,Integer> prefixSum){
        if(root==null){
            return 0;
        }
        
        currSum+=root.data;
        int count=prefixSum.getOrDefault(currSum-k,0); 
        prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)+1);
        
        
        count+=countPath(root.left,currSum,k,prefixSum);
        count+=countPath(root.right,currSum,k,prefixSum);
        
        //backTrack remove sum from map
        prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)-1);

        return count;
    }
    
    
    public int sumK(Node root, int k) {
        // code here
        Map<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,1);
        
        return countPath(root,0,k,prefixSum);
    }
}