class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        int left = 1;
        int right = max;
        int ans = max;

        while(left <= right){
            int mid = left + (right - left) / 2; 
            int TotalHours = 0;

            for(int pile : piles){
                TotalHours += (pile + mid - 1) / mid;
            }

            if(TotalHours <= h){
                ans = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
            
        }
        return ans;
    }
}
