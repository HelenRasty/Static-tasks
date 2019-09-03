public class Math {
    final static double PI = 3.14;

    public static int findMin (int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax (int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double areaOfCircle(double radius){
        double area;
        area = PI * java.lang.Math.pow(radius, 2);
        return area;
    }


}
