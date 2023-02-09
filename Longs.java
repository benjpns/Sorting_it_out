package sorting;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

class Longs {
    int totalNumber;
    long greatestNumber;
    int repeating;
    double percent;

    public void Compute(List<Long> number) throws InputMismatchException {
        totalNumber = number.size();
        greatestNumber = Collections.max(number);
        repeating = Collections.frequency(number, greatestNumber);
        percent = (double) repeating / totalNumber * 100;
    }
    public void printd() {
        System.out.printf("Total number: %s \n", totalNumber);
        System.out.printf("The greatest number: %s (%d times(s), %s%%)", greatestNumber, repeating, (int) percent);
    }

}