
class Solution {
public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;

        int max = 0;
        while(i < j) {
            int currentWater = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(currentWater, max);

            if(height[i] < height[j]) {
                i++;
            }
            else if (height[i]>height[j]){
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        return max;
    }
}