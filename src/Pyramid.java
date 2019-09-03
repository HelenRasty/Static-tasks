public class Pyramid {
    public static void printPyramid(int h) {
        int i, j, k, l;
        for (i = 1; i <= h; i++) {

            for (j = h; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= i ; k++) {
                System.out.print(k);
            }

            for (l = i - 1; l >= 1 ; l--) {
                System.out.print(l);

            }

            System.out.println();
        }
    }
}
