package sorting;

import java.util.Objects;

public enum Runtime {
    XDATATYPE("DATATYPEWORD", "DATATYPELINE", "DATATYPELONG"),
    SORTINGTOOL("SORTINGTOOLSORTINTEGER", "DATATYPEWORDSORTINTEGER", "DATATYPELSORTINTEGER");

    private String word;
    private String line;
    private String longs;
    private String sort;
    private String wordSort;
    private String longSort;
    private String lineSort;

    Runtime(String word, String line, String longs) {
        this.word = word;
        this.line = line;
        this.longs = longs;
    }
    Runtime(String sort, String wordSort, String longSort, String lineSort){
        this.sort = sort;
        this.wordSort = wordSort;
        this.longSort = longSort;
        this.lineSort = lineSort;
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

    public String getWordSort() {
        return wordSort;
    }
    public String getLineSort() {
        return lineSort;
    }
    public String getLongSort() {
        return longSort;
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
            if (Objects.equals(value.wordSort, str)) {
                return getWordSort();
            }
            if (Objects.equals(value.lineSort, str)) {
                return getLineSort();
            }
            if (Objects.equals(value.longSort, str)) {
                return getLongSort();
            }

        }
        return null;
    }
}
