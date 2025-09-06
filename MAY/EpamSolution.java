package MAY;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EpamSolution {
    public static void main(String[] args) {
        String inputs = "Developers love coding challenges";
        //print which sentence doesnt have duplicate alphabets
//        Given a sentence, find the longest word that has
//        only unique characters using Java 8 streams.

//        Optional<String> longestWord =




        System.out.println( Arrays.stream(inputs.split(" ")).
                filter(
                        words -> words.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .values().stream()
                        .allMatch(count -> count==1)
                )
                .max(Comparator.comparingInt(String::length)).get());
//        System.out.println(longestWord.get());






    }
}
