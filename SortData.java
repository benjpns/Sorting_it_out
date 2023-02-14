package sorting;
import java.util.*;

public class SortData<T extends Comparable<T>> implements Toprint {
    int totalNumber;
    List<T> data;
    String stringSortedData;
    Map<T, Integer> bycount = new TreeMap<>();
    StringBuilder srtData;
    public void Compute(List<T> number) throws InputMismatchException {
        totalNumber = number.size();
        Collections.sort(number);
        this.data = number;
        for (T t : number){
            if (bycount.containsKey(t)){
                bycount.put(t, bycount.get(t) + 1);
            } else {
                bycount.put(t, 1);
            }
        }
        newLine();
    }

    public void newLine() {
        srtData = new StringBuilder();
        for (T s : data){
            srtData.append(s).append(" ");
        }
        stringSortedData = String.valueOf(srtData);
    }


    @Override
    public String word() {
        return "Total words: " + totalNumber;
    }

    @Override
    public String line() {
        return "Total lines: " + totalNumber;
    }

    @Override
    public String number() {
        return "Total numbers: " + totalNumber;
    }

    public void print() {
        System.out.printf("Sorted data: %s", stringSortedData);
    }
}




class Line extends SortData<String>{
    @Override
    public void newLine(){
        srtData = new StringBuilder();
        for (String s : data){
            srtData.append(s).append("\n");
        }
        stringSortedData = String.valueOf(srtData);
    }
    @Override
    public void print(){
        System.out.printf("Sorted data: \n%s", stringSortedData);
    }
}

class Bycount extends SortData<Long>{
    public void print(){
        System.out.println(this.bycount);
    }
}



