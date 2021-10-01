package Book;

public class Q7ConvertingAstring {
    public static void main(String[] args) {
        String num = "43434";
        convertString(num);
    }

    /**
     * A proper solution for converting String into int, long, float,
     * or double consists of using the following Java methods of the Integer, Long, Float, and Double
     * classes—parseInt(), parseLong(), parseFloat(), and parseDouble():
     * @param str
     */
    public static void convertString(String str) {
//       int num = Integer.parseInt(str);
//        System.out.println("num = " + num);
        long nums = Long.parseLong(str);
        System.out.println("nums = " + nums);
    }

    /**
     * Converting String to Integer ,Long,Float,Double
     * Converting String into an Integer, Long, Float, or Double object
     * can be accomplished via the following Java methods—Integer.valueOf(),
     * Long.valueOf(), Float.valueOf(), and Double.valueOf():
     */

   /** Integer toInt = Integer.valueOf(TO_INT);
    Long toLong = Long.valueOf(TO_LONG);
    Float toFloat = Float.valueOf(TO_FLOAT);
    Double toDouble = Double.valueOf(TO_DOUBLE);
    */

   public static void convertString1(String WRONG_NUMBER) {
       WRONG_NUMBER = "452w";

       try {
           Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
       } catch (NumberFormatException e) {
           System.err.println(e);
           // handle exception
       }

       try {
           int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
       } catch (NumberFormatException e) {
           System.err.println(e);
           // handle exception
       }
   }


}
