public class Main {
    static char[] reverse(char[] array) {
        char[] reversed = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= 'a' && array[i] <= 'z' || array[i] >= 'A' && array[i] <= 'Z') {
                while (reversed[j] != '\0') {
                    j++;
                }
                reversed[j] = array[i];
                j++;
            } else {
                int jCurrent = j;
                j = i;
                reversed[j] = array[i];
                j = jCurrent;
            }
        }
        return reversed;
    }

    public static String toAnagram(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            char[] wordReversed = reverse(w.toCharArray());
            result.append(new String(wordReversed));
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toAnagram("a 1 bcdefg!h"));
    }
}