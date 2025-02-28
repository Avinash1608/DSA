 class Solution{
    int calculate(int a,int b,String op){
        switch(op){
            case "+": return a+b;
            case "*": return a*b;
            case "/": return a/b;
            case "-": return a-b;
            default: return a;
        }
    }
    boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") ||op.equals("/");
    }
    public int evaluate(String[] arr) {
        // code here
        
        Stack<Integer> st=new Stack<>();
        
        for(String ch:arr){
            if(isOperator(ch)){
                int b=st.pop();
                int a=st.pop();
                
                int res=calculate(a,b,ch);
                st.push(res);
                
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
        
    }
}