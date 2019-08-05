package hbcu.stay.ready.algor;

import java.util.*;

public class Solution {

    public String countUniqueWords(String input){

        //must find where to implement input, currently not pointing to anything
        List<String> wordsArray = Arrays.asList(" ");

        Set<String> uniqueWords = new HashSet<>(wordsArray);
        String output = "The " + uniqueWords.size() + " unique words are:\n";
        for(int x = 0; x < wordsArray.size(); x++){
            String words = wordsArray.get(x);
            output = output + words + " (Seen " + Collections.frequency(wordsArray, uniqueWords) +
                    ")\n";
        }
        return output;

    }
}
