package InterviewQuestions.String;

public class SumNumberFromString {
    public static void main(String[] args) {

        String word = "ABCD123EFG45HI6789n"; // ABC 123 EFG 45 HI 789
        System.out.println("sumStringNumber(word) = " + sumStringNumber(word));
        System.out.println("sumStringNumber2(word) = " + sumStringNumber2(word));

    }

    public static int sumStringNumber(String word) {
        //check the Charactor is digit if digit save in the temp with space delimiter
        String temp = "";
        int sumNum = 0;
        for (int i = 0; i < word.length(); i++) {   //ABCD123EFG45HI6789
            // this step is to control the loop from out of bound
            if (i == word.length() - 1 && Character.isDigit(word.charAt(i))) {
                temp += word.charAt(i);
                break;
            }
            // this to check the Charactor digit
            if (Character.isDigit(word.charAt(i)) && Character.isDigit(word.charAt(i + 1))) {
                temp += word.charAt(i) + "";
            } else if ((Character.isDigit(word.charAt(i)) && !Character.isDigit(word.charAt(i + 1)))) {
                temp += word.charAt(i) + " ";
            }
        }

        String[] result = temp.split(" ");
        for (int i = 0; i < result.length; i++) {
            int num = Integer.parseInt(result[i]);
            sumNum += num;
        }

        return sumNum;
    }

    public static int sumStringNumber2(String word) {
        String temp = "";
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            // in the last index
            if (i == word.length() - 1) {
                if (Character.isDigit(each)) {
                    temp+= ""+ each; // if i difn't make string then it gone be char
                    result+= Integer.parseInt(temp);
                    break;
                }
            }
            if(Character.isDigit(each)){
                temp+=""+each;
                if(!Character.isDigit(word.charAt(i+1))){
                    result+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }

        return result;
    }
}
