package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int x = 1; x <= cathetusLength; x++) {
                for (int y = 1; y <= cathetusLength - x; y++) {
                    System.out.print(" ");
                }
                for (int y = x; y >= 1; y--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
