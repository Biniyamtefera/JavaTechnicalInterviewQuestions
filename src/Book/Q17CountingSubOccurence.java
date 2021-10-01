package Book;

public class Q17CountingSubOccurence {
    public static void main(String[] args) {

    }
    public static int countStringInString(String string, String toFind) {

        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position = position + n;
            count++;
        }

        return count;
    }
}
