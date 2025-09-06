package MAY;

public class MergeAlternatelySTRING {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
//        Output: "apbqcr"
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = Math.max(c1.length, c2.length);
        for (int i = 0; i < maxLength; i++) {
            if (i< c1.length){
                stringBuilder.append(c1[i]);
            }
            if(i<c2.length){
                stringBuilder.append(c2[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
