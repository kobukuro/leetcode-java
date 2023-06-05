public class ContainerWithMostWater11 {
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(res, area);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new ContainerWithMostWater11().maxArea(height)); // 49
    }
}
