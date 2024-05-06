package ch.hslu.demo.sw03;

public class Demo {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(a, b) > c ? max(a, b) : c;
    }

    public void printRowsFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void printRowsWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void printRowsDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public void increaseFloatToOne() {
        for (float f = 0.9f; f <= 1f; f += 0.000025f) {
            System.out.println(f);
        }
    }

    public void fixedIncreaseFloatToOne() {
        float f = 0.9f;
        for (int i = 0; i < 4000; i++) {
            System.out.println(f);
            f += 0.000025f;
        }
    }

    public void printBox(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int y = 0; y < width; y++) {
                if (i == 0 || y == 0 || i == height - 1 || y == width - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
