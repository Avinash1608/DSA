class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    void helper(Node root, ArrayList<Integer> list){
         if(root==null){
            list.add(-1);
            return;
        }
        
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
        
    }
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        
        return list;
    }

    // Function to deserialize a list and construct the tree.
    int i=0;
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int val=arr.get(i);
        i++;
        if(val==-1) return null;
        
        Node newNode=new Node(val);
        newNode.left=deSerialize(arr);
        newNode.right=deSerialize(arr);
        
        return newNode;
    }
};