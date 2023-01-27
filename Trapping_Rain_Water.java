public class Trapping_Rain_Water {
    public static int getTrappingRainWater(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];


        int waterUnits=0;
        for(int leftMaxIndex = 1; leftMaxIndex < leftMax.length; leftMaxIndex++) {
            leftMax[leftMaxIndex] = Math.max(leftMax[leftMaxIndex - 1], height[leftMaxIndex]);
        }

        for(int rightMaxIndex = height.length - 2; rightMaxIndex >= 0;rightMaxIndex--){
            rightMax[rightMaxIndex]= Math.max(rightMax[rightMaxIndex + 1], height[rightMaxIndex]);

        }

        for(int currentIndex = 0; currentIndex < height.length; currentIndex++){
            waterUnits = waterUnits + (Math.min(leftMax[currentIndex], rightMax[currentIndex]) - height[currentIndex]);
        }

        return waterUnits;
    }




            
    public static void main(String[] args) {
        int[] a = {5,0,5,3,2,1,4};
        System.out.println(getTrappingRainWater(a));
    }
    
}
