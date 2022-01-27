package youtubeVedioIQ.NavinIQ;

public class LeapYear {
   ////divisible by four all the centuary years --end with 00
    // centuaryy year is leap year only when its perfectly divisible by 400
    //1900 is not leap year
    //2012 leap year

    public static void main(String[] args) {
        int year = 2012;
        boolean leap = false;

        if(year % 4 ==0) {
            if(year %100==0) {
                if(year % 400 ==0) {
                    leap = true;
                } else {
                    leap = false;
                }
            }else {
                leap = true;
            }
        }  else {
            leap = false;
        }
        if(leap) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }
}
