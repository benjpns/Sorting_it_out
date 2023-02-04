package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Word {
    int totalWord;
    String longestWord;
    int repeating;
    double percent;

    public void Compute(List<String> word) {
        totalWord = word.size();
        longestWord = word.stream().max(Comparator.comparingInt(String::length)).get();
        repeating = Collections.frequency(word, longestWord);
        percent = (double) repeating / totalWord * 100;
    }

    public void printd() {
        System.out.printf("Total words: %s \n", totalWord);
        System.out.printf("The longest word: %s (%d times(s), %s%%)", longestWord, repeating, (int) percent);
    }
}
