public class nestedLoops {
    public static void main(String[] args) {
        /*
         * for (int i = 0; i < 10; i++) {
         * for (int x = 0; x <= i; x++) {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */
        int x = 0;
        for (int i = 10; i > x; i--) {

            for (int y = 10; y > x + i ; y--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
