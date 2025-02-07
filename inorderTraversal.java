class Solution {
    // Function to return a list containing the inorder traversal of the tree.
   static ArrayList<Integer> traversal(Node root,ArrayList<Integer> list ){
       
       if(root == null) return list;
       
       traversal(root.left,list);
       list.add(root.data);
       traversal (root.right,list);
       
       
       return list;
   }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list=new ArrayList<>();
        return traversal(root,list);
        
    }
}