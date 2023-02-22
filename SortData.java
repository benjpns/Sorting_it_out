package sorting;
import java.util.*;
import java.util.stream.Collectors;

public class SortData<T extends Comparable<T>> implements Toprint {
    int totalNumber;
    List<T> data;
    String stringSortedData;
    Map<T, Integer> bycount = new HashMap<>();
    StringBuilder srtData;
    public void Compute(List<T> number) throws InputMismatchException {
        totalNumber = number.size();
        Collections.sort(number);
        naturalSort(number);
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

    public void naturalSort(List<T> number) {
        Collections.sort(number);
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

class Bycount<T extends Comparable<T>> extends SortData<T>  {
    Map<T, Integer> unSortedmap = new TreeMap<>();
   Map<T, Integer> repeatElements = new LinkedHashMap<>();
    public  void naturalSort() {
        unSortedmap = bycount;
        //put repeating elements in lastIndexas
        for (T key: bycount.keySet()){
            System.out.println(key + ":" + bycount.get(key));
            if (bycount.get(key) > 1){
                repeatElements.put(key, bycount.get(key));
            }
        }
        //remove repeated element sets from unsortedmap
        unSortedmap.values().removeIf(v -> v > 1);

        // sor
        System.out.println("repeating elements" + repeatElements.entrySet());
        System.out.print(unSortedmap.entrySet());

    }
    public void print(){
        naturalSort();
    }
}

/*
  for (Integer n: bycount.values()){
            if (n > 1){
                byvalue.put((T) bycount.get(n), n);
            }
        }
 */

