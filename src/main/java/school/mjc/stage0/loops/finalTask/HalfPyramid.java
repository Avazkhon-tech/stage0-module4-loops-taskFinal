package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        int label = cathetusLength - 1;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= label) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            label--;
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }
}
