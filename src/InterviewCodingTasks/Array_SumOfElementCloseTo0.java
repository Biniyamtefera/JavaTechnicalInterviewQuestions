package InterviewCodingTasks;

public class Array_SumOfElementCloseTo0 {

    /*
        return the sum of the two elements closest to zero
     */

    public static int getSumOfTwoClosestToZeroElements(int[] a) {
        /*
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.
        */
        // {1,3,2,4,}
        int b[] = new int[2];
        int z = 0;
        for (int i = 0; i < a.length; i++)   //i=1
            for (int j = i + 1; j < a.length; j++) { //j=3,2
                int sum = a[i] + a[j]; //1+3  1+2 =3
                if (z == 0)
                    z = sum;   //4
                if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {   //sum =4 z=4
                    z = sum;  //4  3
                    b[0] = a[i]; //
                    b[1] = a[j];
                }
            }
        return z;
    }

    public static int getSum(int [] num) {
       int sum =0;
       int z =0;
          for(int i=0; i < num.length; i++) {
              for (int j=0; j < num.length; j++) {
                  sum = num[i] + num[j];
                  if(z==0) {
                      z = sum;
                  }
                  if(Math.abs(sum)>0 && Math.abs(sum) < Math.abs(z)) {
                      z=sum;
                  }

              }
          }
        return z;
    }


}
