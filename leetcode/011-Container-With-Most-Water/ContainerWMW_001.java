public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = Math.min(height[i], height[j]) * (j - i);
        int tmp = 0;
        
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            
            tmp = Math.min(height[i], height[j]) * (j - i);
            if (tmp > res) {
                res = tmp;
            }
        }
        
        return res;
    }
}
