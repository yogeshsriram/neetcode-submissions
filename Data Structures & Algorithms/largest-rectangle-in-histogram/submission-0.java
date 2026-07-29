class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int MaxArea = 0;
        
        for(int i = 0; i <= heights.length; i++){
            int currHt =  (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && currHt < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;

                if(stack.isEmpty()){
                    width = i;
                } else{
                    width = i - stack.peek() - 1;
                }
                int area = width * height;
                MaxArea = Math.max(MaxArea, area);
            }
            stack.push(i);
        }
        return MaxArea;
    }
}
