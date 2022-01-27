package InterviewCodingTasks;

public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,4,7,8,3};
        System.out.println(firstDuplicated(arr));
    }
    public int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }

    public static int firstDuplicated(int [] arr) {
        // {3,4,5,6,4}
          int firstdup = arr[0];
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j) {
                    firstdup = arr[i];
                    return firstdup;
                }

            }
        }
        return 0;
    }


}
