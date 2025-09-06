package MAY;

import java.util.*;

public class EpamSolution2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "listen", "silent", "enlist", "google", "gooegl",
                "inlets", "cat", "act", "tac", "dog"
        );
        Set<String> visited = new HashSet<>();
        List<String> res = new ArrayList<>();
        for (int i =0; i<input.size(); i++){
           String word1 = input.get(i);
           if(visited.contains(word1)) continue;
           char c1 [] = word1.toCharArray();
           Arrays.sort(c1);
           boolean groundFound = false;

            for (int j = i+1; j < input.size() ; j++) {
                String word2 = input.get(j);
                char [] c2 = word2.toCharArray();
                Arrays.sort(c2);
                if(Arrays.equals(c1,c2)){
                    if(!groundFound){// debug
                        res.add(word1);
                        visited.add(word1);
                        groundFound = true;
                    }
                    res.add(word2);
                    visited.add(word2);
                }
            }
        }
        res.forEach(s -> System.out.print(" - " + s));
    }
}
