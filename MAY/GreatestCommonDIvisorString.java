package MAY;

import javax.print.DocFlavor;

public class GreatestCommonDIvisorString {
    public static void main(String[] args) {
        String string = "ABCABC";
//        Input: str1 = "ABCABC", str2 = "ABC"
//        Output: "ABC"
//        Input: str1 = "ABABAB", str2 = "ABAB"
//        Output: "AB"
        char charArrayar[] = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArrayar.length - 1; i++) {
            for (int j = i + 1; j < charArrayar.length - 1; j++) {
                if (charArrayar[i] != charArrayar[j]) {
                    stringBuilder.append(charArrayar[j]);
                } else {
                    break;
                }

            }
            System.out.println(stringBuilder.toString());

        }
    }
}


