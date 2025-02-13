class Solution {
    void inorder(Node root, ArrayList<Integer> list){
        if(root==null) return;
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> list=new ArrayList<>();
        
        inorder(root,list);
        
        int s=0,e=list.size()-1;
        
        while(s<e){
            if(list.get(s)+list.get(e) == target)return true;
            
            if(list.get(s)+list.get(e) > target) e--;
            
            if(list.get(s)+list.get(e) < target) s++;
        }
        
        return false;
    }
}
