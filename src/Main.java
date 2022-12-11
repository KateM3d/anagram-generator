public class Main {
    private static String glueInput(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private static String[] bisectInput(String input) {
        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();

        for (int i = 0, j = (input.length()) / 2; i <= input.length() / 2 && j < input.length(); i++, j++) {
            word1.append(input.charAt(i));
            word2.append(input.charAt(j));
        }

        String[] bisectInputResult = new String[]{word1.toString(), " ", word2.toString()};
        return bisectInputResult;
    }

    private static String reverse(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    private static String anagramize(String input) {
        StringBuilder sb = new StringBuilder();

        for (String s : bisectInput(glueInput(input))) {
            sb.append(reverse(s));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("abcd efgh" + " => " + anagramize("abcd efgh")); //"dcba hgfe"
        System.out.println("a 1 bcdefg!h" + " => " + anagramize("a 1 bcdefg!h")); //"d1cba hgf!e"
    }

}
