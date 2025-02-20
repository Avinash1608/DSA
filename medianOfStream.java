class Solution{
public ArrayList<Double> getMedian(int[] arr) {
        // code here
        
        ArrayList<Double> res=new ArrayList<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        
        for(int n:arr){
            addNum(n,maxHeap,minHeap);
            res.add(findMin(maxHeap,minHeap));
            
        }
        return res;
    }
    
    void addNum(int n,PriorityQueue<Integer> maxHeap,PriorityQueue<Integer> minHeap){
        //adding element to heap
        if(maxHeap.isEmpty() || n<=maxHeap.peek()){
            maxHeap.add(n);
        }
        else{
            minHeap.add(n);
        }
        
        //balancing
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.poll());

        }
    }
    
    double findMin(PriorityQueue<Integer> maxHeap,PriorityQueue<Integer> minHeap){
        if(maxHeap.size()>minHeap.size()){
            return maxHeap.peek();
        }
        else{
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }
    
}