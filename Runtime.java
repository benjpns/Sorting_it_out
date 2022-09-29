package sorting;

public enum Runtime {
    DATATYPE("DATATYPEWORD", "DATATYPELINE", "DATATYPELONG", "DATATYPEWORDSORTINTEGERS", "DATATYPELINESORTINTEGERS", "DATATYPELONGSORTINTEGERS"),
    SORTINGTOOL("SORTINGTOOLSORTINTEGERS", "SORTINTEGERS"), SORTINTEGERS("SORTINTEGERS");


    private String word;
    private String line;
    private String longs;
    private String sort;
    private String wordSort;
    private String longSort;
    private String lineSort;
    private String na;

    Runtime(String word, String line, String longs, String wordSort, String lineSort, String longSort) {
        this.word = word;
        this.line = line;
        this.longs = longs;
        this.wordSort = wordSort;
        this.longSort = longSort;
        this.lineSort = lineSort;
    }

    Runtime(String sort, String SortInt) {
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

    public String getWordSort() {
        return wordSort;
    }

    public String getLineSort() {
        return lineSort;
    }

    public String getLongSort() {
        return longSort;
    }

    Runtime(String na) {
        this.na = na;
    }

    public String getNa() {
        return na;
    }

}
