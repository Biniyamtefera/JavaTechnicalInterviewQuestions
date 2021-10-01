package InterviewProblemCanvas;
/**
 Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
 Ex:input:  {1,0,2,0,3,0,4,0};
 output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class PushZero {
    public static void main(String[] args) {

    }
    //creating a new array with the same length
    public static void pushZero(int [] arr) {
       int [] newArr = new int[arr.length];
       int count=0;
       int y =0;
       for ( int i=0; i < arr.length;i++) {
           if(arr[i] > 0) {
               newArr[count++]=arr[i];
           }
           if(arr[i]!=0) {
               newArr[y++] = arr[i];
           }
       }
    }
}
