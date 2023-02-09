package sorting;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class SortData<T extends Comparable<T>> {
    int totalNumber;
    List<T> data;
    String stringSortedData;


    public void Compute(List<T> number) throws InputMismatchException {

        totalNumber = number.size();
        Collections.sort(number);
        data = number;
        StringBuilder srtData = new StringBuilder();
        for (T s : data){
            srtData.append(s).append(" ");
        }
        stringSortedData = String.valueOf(srtData);
    }

    public void numbers() {
        System.out.printf("Total numbers: %s \n", totalNumber);
        System.out.printf("Sorted data: %s", stringSortedData);
    }
}
