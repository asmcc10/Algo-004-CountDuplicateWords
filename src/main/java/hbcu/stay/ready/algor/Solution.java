package hbcu.stay.ready.algor;

import java.util.*;

public class Solution {

    public String countUniqueWords(String input){

        String replacePeriods = input.replaceAll(".", "");
        String replaceExplamation = replacePeriods.replace("!", "");
        String [] splitString = replaceExplamation.split(" ");

        Map<String, Integer> uniqueWords = new HashMap<>();

        for(String word : splitString){
            if(!uniqueWords.containsKey(word)){
                uniqueWords.put(word, 1);
                }
            else {
                int value = uniqueWords.get(word);
                value++;
                uniqueWords.put(word, value);
            }
        }

        int size = 0;
        String output = "The " + uniqueWords.size() + " unique words are:\n";
        for (String string : uniqueWords.keySet()) {
            size++;
            int val = uniqueWords.get(string);
            if (size < uniqueWords.size())
                output = output + uniqueWords.get(string) + " (Seen " + val + ")\n";
            else
                output = output + uniqueWords.get(string) + " (Seen " + val + ")";

        }
        return output;

    }
}
