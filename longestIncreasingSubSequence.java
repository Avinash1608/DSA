class Solution{
static int lis(int arr[]) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int n:arr){
            int pos=Collections.binarySearch(list,n);
            
            if(pos<0) pos=-(pos+1);
            
            if(pos==list.size()){
                list.add(n);
            }
            else{
                list.set(pos,n);
            }
        }
        return list.size();
    }
}