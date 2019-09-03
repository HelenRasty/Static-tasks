public class Calculator {

    public static double calcPi(int n) {
        double pi = 0;
        int tmp = 1;

        for (int i = 1; i < n; i = i + 2) {
            if (tmp < 0) {
                tmp = tmp * (-1);
                pi = pi - 4.0 / i;

            } else {
                tmp = tmp * (-1);
                pi = pi + 4.0 / i;
            }
        }
        return pi;
    }
}