class Solution {
    // Return the Kth smallest element in the given BST
    
    void traversal(Node root,ArrayList<Integer> list){
        if(root==null) return;
        
        traversal(root.left,list);
        list.add(root.data);
        traversal(root.right,list);
    }
    
    public int kthSmallest(Node root, int k) {
        // Write your code here
        
        ArrayList<Integer> list=new ArrayList<>();
        
        traversal(root,list);
        
        Collections.sort(list);
        
        if(k>list.size())
            return -1;
        
        return list.get(k-1);
    }
}
