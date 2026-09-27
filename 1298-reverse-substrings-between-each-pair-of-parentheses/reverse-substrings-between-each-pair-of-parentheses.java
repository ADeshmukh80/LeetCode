class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(sb.length());
                
            }else if(ch==')'){
                int start=st.pop();
                reverse(sb,start,sb.length()-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
   private void reverse(StringBuilder sb, int start, int end) {
    while (start < end) {
        char t = sb.charAt(start);

        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end, t);

        start++;
        end--;
    }
}
}