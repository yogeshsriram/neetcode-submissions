class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String num : tokens){
            if(isNum(num)){
                stack.push(Integer.parseInt(num));
            }
            else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(num.equals("+")){
                    stack.push(num2 + num1);
                }
                if(num.equals("-")){
                    stack.push(num2 - num1);
                }
                if(num.equals("*")){
                    stack.push(num2 * num1);
                }
                if(num.equals("/")){
                    stack.push(num2 / num1);
                }

            }
        }
        return stack.pop();
    }
    public static boolean isNum(String a){
        try{
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
