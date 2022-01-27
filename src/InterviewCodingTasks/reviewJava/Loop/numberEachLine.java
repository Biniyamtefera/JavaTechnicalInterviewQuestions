package InterviewCodingTasks.reviewJava.Loop;

import java.util.Scanner;

/**
 * Print out the number in diffrent line
 */
public class numberEachLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String intString = scan.next();

        System.out.println(intString);
        for(char each : intString.toCharArray()){
            System.out.println(each);
        }

        /**
         * print matrix to consule
         */
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };
        System.out.println(matrix.length);
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        /**
         * Pyramid in console
         */

        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i < height + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
