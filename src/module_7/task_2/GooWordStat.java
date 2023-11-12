package module_7.task_2;

class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}

class GooWordStat{

    private final String word;
    private final int freq;

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    public GooWordStat(String word, int freq){

        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString(){
        String temp = "";
        if (this.getFreq() < 1000){
            temp = "LOW";
        } else if (this.getFreq() >= 1000 && this.getFreq() < 100000) {
            temp = "MEDIUM";
        }else if (this.getFreq() >= 100000  && this.getFreq() < 10000000 ){
            temp = "HIGH";
        }else if (this.getFreq() >= 10000000){
            temp = "EXTRA HIGH";
        }

        return "Word is [" + this.getWord() + "], search freq is " + temp;
    }
}