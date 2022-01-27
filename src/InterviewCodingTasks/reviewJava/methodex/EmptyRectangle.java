package InterviewCodingTasks.reviewJava.methodex;

import java.util.Scanner;

/**
program starts and ask user to input height of the rectangle
After user inputs of the rectangle, program asks input width of the rectangle
program calls specific method which takes two parameter of int typ which print rectangle to the console
 */
public class EmptyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);

    }

    public static void drawRectangle(int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == 0 || i == height -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
