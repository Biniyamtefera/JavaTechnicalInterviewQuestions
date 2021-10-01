package InterviewQuestions.String;

import java.util.Arrays;

public class VerifyPassword {
    public static void main(String[] args) {


        String password = "gsjg423$$FAs";
        boolean passwordIsLegit = true;
        int length = 0;
        int upperCaseChar = 0;
        int lowerCaseChar = 0;
        int specialChar = 0;
        int containsDigit = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.length() >= 6) {
                length++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upperCaseChar++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCaseChar++;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                specialChar++;
            }
            if (Character.isDigit(password.charAt(i))) {
                containsDigit++;
            }
        }

        if (length == 0 || lowerCaseChar == 0 || containsDigit == 0) {
            passwordIsLegit = false;
            System.out.println(passwordIsLegit);
        } else {
            System.out.println(passwordIsLegit);
        }








        System.out.println(isValid("Pas$word1"));
    }

    public static boolean password(String pass) {
        char[] charArray = pass.toCharArray();
        String specialChars = "/!@#$%^&()";
        int[] count = new int[4];

        if (pass.length() > 6) {
            for (int i = 0; i < pass.length(); i++) {
                if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                    count[0]++;
                    continue;
                }
                if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                    count[1]++;
                    continue;
                }
                if (charArray[i] >= 48 && charArray[i] <= 57) {
                    count[2]++;
                    continue;
                }
                if (specialChars.contains("" + charArray[i])) {
                    count[3]++;
                }
            }
        } String countNums = Arrays.toString(count);
        if (!(countNums.contains("0"))) {
            return true;
        }
        return false;
    }




    public static boolean isValid(String pass) {
         int count = 0;
         int countEspecial=0;
         int isUpperCase = 0;
        if (pass.length() >= 6 && !(pass.contains(" "))) {
            for (int i=0; i < pass.length(); i++) {
                if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') { count++; }
                if(Character.isUpperCase(pass.charAt(i))) {}
            }
            if (count >=1) {

                for (int i=0; i < pass.length(); i++) {
                    if ((pass.charAt(i) > 'A' && pass.charAt(i) < 'Z') &&(pass.charAt(i) > 'a' && pass.charAt(i) < 'z')){
                        countEspecial++;
                    }
                }
                if (countEspecial >= 0) {
                    for (int i=0; i < pass.length(); i++) {
                        if (pass.charAt(i) > 0 && pass.charAt(i) < 9) {
                            count++;
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

}
