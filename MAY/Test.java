package MAY;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        print the Strings which are Anagrams(start and end with same character) of each other..?
//        String arr[] = { “abcd”, “java”, “dcba”, “ajav”, “xyz”, “epam”, “pame”, “aepm” };
//        -------------
//        [epam, pame, aepm] contains same character
//
//                [java, ajav] contains same character
//
//                [abcd, dcba] contains same character
        var fname = "Hello World";
        var Lname = "Dlrow olleh";
        char chars [] = fname.toCharArray();
        char chars2[] = Lname.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length-1; i >=0; i--) {
            stringBuilder.append(chars[i]);

        }

        if(Lname.equalsIgnoreCase(stringBuilder.toString().toLowerCase())){
            System.out.println("yes");
        }
//                StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = arr[i].toCharArray().length; j >=0; j--) {
//                stringBuilder.append(arr[j]);
//            }



        }



    }

