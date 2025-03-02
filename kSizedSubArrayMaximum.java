Class Solution{ 
public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        int n=arr.length;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        Deque<Integer> deque=new LinkedList();
        
        // for(int i=0;i<=n-k;i++){
        //     int j=i+k;
        //     int max=Integer.MIN_VALUE;
        //     for(int x=i;x<j;x++){
        //         max=Math.max(max,arr[x]);
                
        //     }
        //     list.add(max);
        // }
        
        // return list;
        
        for(int i=0;i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst()==i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            
            if(i>=k-1){
                list.add(arr[deque.peekFirst()]);
            }
        }
        
        return list;
        
        
        
    }
}