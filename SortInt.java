package sorting;

import java.util.Collections;
import java.util.List;

public class SortInt {
    int totalNumber;
    List<Integer> num;
    String stringSortedData;


    public void Compute(List<Integer> number) {
        totalNumber = number.size();
        Collections.sort(number);
        num = number;
        StringBuilder srtData = new StringBuilder();
        for (int s : num){
            srtData.append(s).append(" ");
        }
        stringSortedData = String.valueOf(srtData);


    }
    public void printd() {
        System.out.printf("Total numbers: %s \n", totalNumber);
        System.out.printf("Sorted data: %s", stringSortedData);
    }
}
