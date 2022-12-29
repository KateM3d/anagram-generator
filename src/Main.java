import java.util.Arrays;

public class Main {
    static char[] letters = {'a', 'b', 'C', '*', '^', '!', 'd', '!'};
    static char[] reversed = new char[letters.length];

    static boolean checkIfEmpty(int position) {
        return reversed[position] == '\0';
    }

    static void reverse(char[] array) {
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= 'a' && array[i] <= 'z' || array[i] >= 'A' && array[i] <= 'Z') {
                while (!checkIfEmpty(j)) {
                    j++;
                    checkIfEmpty(j);
                }
                reversed[j] = letters[i];
                j++;
            } else {
                int jCurrent = j;
                j = i;
                reversed[j] = array[i];
                j = jCurrent;
            }
            System.out.println(Arrays.toString(reversed));
        }
    }

    public static void main(String[] args) {
        reverse(letters);
    }
}
