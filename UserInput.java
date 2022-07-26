package sorting;

import java.util.*;

public  class UserInput<E> {
     List<E> input = new ArrayList<>();
}

class Type {
    UserInput<String> line;
    UserInput<Integer> number;
    UserInput<String> word;
    ArrayList<Integer> lineOrWordStringLength = new ArrayList<>();
    SortInterface sInterface;
    BigNumber bNumber;
    BigString bString;
    Times times;
    Percentage percent;

    SortedData sData;
    StringBuilder sortedData;

    String userArgs;
    public Type(String userArgs){




        this.userArgs = userArgs;
        Scanner scan = new Scanner(System.in);
        switch (userArgs) {
            case "line": {
                line = new UserInput<>();
                while (scan.hasNextLine()) {
                    line.input.add(scan.nextLine());
                }
                for(int i = 0; i < line.input.size(); i++) {
                    lineOrWordStringLength.add(line.input.get(i).length());
                }
                sInterface = () -> line.input.size();
                bString = () -> line.input.get(lineOrWordStringLength.indexOf(Collections.max(lineOrWordStringLength)));
                times = () -> Collections.frequency(line.input, bString.bString());
                percent = () -> ((double) times.times() / sInterface.TotalNumbers()) * 100;
                break;
            }
            case "long": {
                number = new UserInput<>();
                while (scan.hasNextInt()) {
                    number.input.add(scan.nextInt());
                }
                sInterface = () -> number.input.size();
                bNumber = () -> Collections.max(number.input);
                times = () -> Collections.frequency(number.input, bNumber.Large());
                percent = () -> ((double) times.times() / sInterface.TotalNumbers()) * 100;
                break;
            }
            case "word":
                 word = new UserInput<>();
                while (scan.hasNext()) {
                    word.input.add(scan.next());
                }
                for(int i = 0; i < word.input.size(); i++) {
                    lineOrWordStringLength.add(word.input.get(i).length());
                }
                sInterface = () -> word.input.size();
                bString = () -> word.input.get(lineOrWordStringLength.indexOf(Collections.max(lineOrWordStringLength)));
                times = () -> Collections.frequency(word.input, bString.bString());
                percent = () -> ((double) times.times() / sInterface.TotalNumbers()) * 100;
                break;
            case "-sortIntegers":
                number = new UserInput<>();
                while (scan.hasNextInt()) {
                    number.input.add(scan.nextInt());
                }
                sInterface = () -> number.input.size();
                sData = () -> Collections.sort(number.input);
                sData.SortData();
                sortedData = new StringBuilder();
                for (int s: number.input){
                    sortedData.append(s).append(" ");
                }
                break;
        }
    }
    
    public String toString(String userArgs) {
        this.userArgs = userArgs;
        if (userArgs.equals("line") || userArgs.equals("long") || userArgs.equals("word")) {
            String numberOrWord = userArgs.equals("long") ? "number" : userArgs.equals("line") ? "line" : "word";
            String greatSynonm = userArgs.equals("long") ? "greatest " : "longest ";
            String numberOrStringValue = userArgs.equals("long") ? String.valueOf(bNumber.Large()) : bString.bString();
            String ifLine = numberOrWord.equals("line") ? "\n" : "";
            return "Total " + numberOrWord + "s: " + sInterface.TotalNumbers() + "\n" + "The " + greatSynonm + numberOrWord +  ": " + ifLine +  numberOrStringValue
                    + ifLine + " (" + times.times() + " time(s), " + (int)percent.percent() + "%)";
        } else if (userArgs.equals("-sortIntegers")) {
            return "Total numbers: " + sInterface.TotalNumbers() + "\n" + "Sorted data: " + sortedData;
        }
        return null;
    }
}

