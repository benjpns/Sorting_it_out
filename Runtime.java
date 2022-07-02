package sorting;

import java.util.Objects;

public enum Runtime {
    DATATYPE("word", "line", "longs"),
    SORTINGTOOL("-sortIntegers");

    private String word;
    private String line;
    private String longs;
    private String sort;

    Runtime(String word, String line, String longs) {
        this.word = word;
        this.line = line;
        this.longs = longs;
    }
    Runtime(String sort){
        this.sort = sort;
    }
    public String getWord() {
        return word;
    }

    public String getLine() {
        return line;
    }

    public String getLongs() {
        return longs;
    }
    public String getSort() {
        return sort;
    }
    public  String type(String str){
        for (Runtime value: values()) {
            if (Objects.equals(value.line, str)) {
                return getLine();
            }
            if (Objects.equals(value.word, str)) {
                return getWord();
            }
            if (Objects.equals(value.longs, str)) {
                return getLongs();
            }
            if (Objects.equals(value.sort, str)) {
                return getSort();
            }

        }
        return null;
    }
}
