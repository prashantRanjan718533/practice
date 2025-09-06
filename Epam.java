import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Epam {
    public static void main(String[] args) {
//


//
        String ss = "Developesrs";
//        ss.chars().mapToObj( data -> (char) data).collect(Collectors.groupingBy(
//                Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//                .forEach(System.out::println);
//        char chr [] = s.toCharArray();
//       Stream.of(chr).mapToInt( dat->)
//               // entryset. filet( entry key ->=
        System.out.println("----");
         String inputs = "Developers love coding challenges";

        System.out.println("result --- ");
        System.out.println(Arrays.stream(inputs.split(" ")).map(String::toLowerCase)
                .filter( words -> words.chars().distinct().count() == words.length())
                .max(Comparator.comparingInt(String::length)).get());
//
       String ress =  Arrays.stream(inputs.split(" ")).filter(
                word -> word.chars().distinct().count() == word.length()
        ).max(Comparator.comparingInt(String::length)).get();
        System.out.println(ress);
        System.out.println(" ----");
//         String str [] = input.split(" ");
//
//
//        Stream<char[]> res = Arrays.stream(str).map(i -> i.toCharArray());
//        -----------
//        Input example:
        List<String> input = Arrays.asList(
                "listen", "silent", "enlist", "google", "gooegl", "inlets", "cat", "act", "tac", "dog"
        );





        List<String> res = new ArrayList<>();
        for (int i = 0; i <input.size() ; i++) {
            res.add(input.get(i));
            char chri [] = input.get(i).toCharArray();
            Arrays.sort(chri);
            for (int j = i+1; j <input.size() ; j++) {
                char chrj[] = input.get(j).toCharArray();
                Arrays.sort(chrj);
                if (Arrays.equals(chri, chrj)) {
                    res.add(input.get(j));
                    break;
                }
            }
        }
        res.stream().forEach(s -> System.out.print(" -"+s));

//
//        Expected output:
//[
//  [enlist, inlets, listen, silent],    // 4 words
//  [act, cat, tac],                     // 3 words
//  [google, gooegl],                   // 2 words
//  [dog]                                // 1 word
//]


    }
}
