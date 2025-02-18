class Solution{ 
int distance(int [] p){
        return p[0]*p[0] + p[1]*p[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int []> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(distance(b), distance(a)) // Max-Heap
        );
        
        for(int[] pt:points){
            pq.add(pt);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        int [][] res=new int[k][2];
        
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        
        return res;
    }
}