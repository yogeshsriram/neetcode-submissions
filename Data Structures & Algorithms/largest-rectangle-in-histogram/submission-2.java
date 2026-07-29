class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int minHt = heights[i];
            for(int j = i; j < heights.length; j++){
                minHt = Math.min(minHt, heights[j]);
                int width = j - i + 1;
                int area = minHt * width;

                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
