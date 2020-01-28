
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String starOut = "";

        for (int i = 0; i < amount; i++) {
            starOut += "*";
        }

        System.out.println(starOut);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String spaceOut = "";

        for (int i = 0; i < amount; i++) {
            spaceOut += " ";
        }
        System.out.print(spaceOut);
    }

    public static void printTriangle(int size) {
        // 40.2
        if (size == 1) {
            printStars(1);
        } else {
            for (int i = 1; i <= size; i++) {
                printWhitespaces(size - i);
                printStars(i);
            }
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // prints the tree part
        int increment = 0;
        for (int i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(i + increment);
            increment++;
        }

        // prints the trunk
        for (int i = 0; i < 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
