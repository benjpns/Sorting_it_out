package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Line {
    int totalLine;
    String logestLine;
    int repeating;
    double percent;

    public void Compute(List<String> line) {
        totalLine = line.size();
        logestLine = line.stream().max(Comparator.comparingInt(String::length)).get();
        repeating = Collections.frequency(line, logestLine);
        percent = (double) repeating / totalLine * 100;
    }

    public void printd() {
        System.out.printf("Total lines: %s\n", totalLine);
        System.out.printf("The longest line:\n%s\n(%d times(s), %s%%)", logestLine, repeating, (int) percent);
    }
}
