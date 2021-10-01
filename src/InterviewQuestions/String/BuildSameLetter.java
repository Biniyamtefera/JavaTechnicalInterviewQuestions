package InterviewQuestions.String;
/*
Write a return method that can remove the duplicated values from String
            Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
public class BuildSameLetter {

    public static void main(String[] args) {
        System.out.println(checkBuild("mBC", "BmA"));
    }
    public static boolean checkBuild(String word1, String word2) {
        for (int i=0; i< word1.length(); i++) {
            if (!word1.contains(word2.charAt(i) + "")) {
                return false;
            }
        }

        return true;
    }
}
