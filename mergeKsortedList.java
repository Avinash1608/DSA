class Solution{ 
// Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
       PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data-b.data);
       
       for(Node n:arr){
           pq.add(n);
       }
       Node head=null,tail=null;
       while(pq.size()>0){
            Node temp=pq.poll();
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            if(temp.next!=null){
                pq.add(temp.next);
            }
       }
       
       return head;
    }
}