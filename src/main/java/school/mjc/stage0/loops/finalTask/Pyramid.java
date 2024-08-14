package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int n = cathetusLength;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
