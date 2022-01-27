package CyberTekIQ.String;

public class String_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "biniyam";
       frequencyOfChars(str);
}

    public static void frequencyOfChars(String str) {
        int count =0;
        String charCount = "";
        for (int i = 0; i <  str.length(); i++) {
            count=0;
                String str1 = str.charAt(i) +"";
            for (int j = 0; j < str.length(); j++) {
                if(str1.equals(str.charAt(j)+"")) {
                    count++;
                }

            }
            if(!charCount.contains(str1)) {
                charCount +=str1 + count;

            }

        }
        System.out.println(charCount);
    }
}
