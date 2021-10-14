package StringDemo;

public class ReverseStringToChara {
    public static void main(String[] args) {
        String str = "It is a test string";
        reverseCharacter(str);
        reverseCharacter2(str);
        reverseString(str);

    }
    public static void reverseCharacter(String str){
      StringBuilder sb = new StringBuilder(str);
      sb.reverse();
        System.out.println(sb);
    }

    public static void reverseCharacter2(String str) {
         String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)!=' ') {
                newStr +=str.charAt(i);
            } if(str.charAt(i)==' ') {
                newStr +=" ";
            }
        }
        System.out.println(newStr);
    }

    public static void reverseString(String str) {
        //before reversing inorder to access each string from the sentence
        //use split method
        String newStr = "";
        String [] arr = str.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            newStr +=arr[i] + " ";
        }

        System.out.println(newStr.trim());
    }

}

