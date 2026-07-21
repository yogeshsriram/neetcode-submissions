class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()) return false;
                else {
                    char top = stack.pop();
                    if(ch == ')' && top != '(') return false; 
                    if(ch == ']' && top != '[') return false;
                    if(ch == '}' && top != '{') return false;
            }
        }
    }
    if (stack.isEmpty()) return true;
    else return false;

}
}
