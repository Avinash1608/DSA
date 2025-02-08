class Solution {
    //left boundary excluding leaf nodes
    
    static boolean isLeaf(Node node){
        
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
    static void addLeft(Node root,ArrayList<Integer> ans){
        Node curr=root.left;
        
        while(curr!=null){
            if(isLeaf(curr)==false)
                ans.add(curr.data);
            if(curr.left!=null)
                curr=curr.left;
            else
                curr=curr.right;
        }
    }
    
    //adding leafnodes
    static void addLeaves(Node root,ArrayList<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        
        if(root.left!=null)
            addLeaves(root.left,ans);
        
        if(root.right!=null)
            addLeaves(root.right,ans);
        
        
    }
    
    // adding right boundary inreverse excluding leafnodes
     static void addRight(Node root,ArrayList<Integer> ans){
         
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();

        
        while(curr!=null){
            if(isLeaf(curr)==false)
                temp.add(curr.data);
            if(curr.right!=null)
                curr=curr.right;
            else
                curr=curr.left;
        }
        
        
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
        
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        
        ArrayList<Integer> res=new ArrayList<>();
        
        if(isLeaf(node)==false) res.add(node.data);
        
        addLeft(node,res);
        addLeaves(node,res);
        addRight(node,res);
        
        
        return res;
        
    }
}
