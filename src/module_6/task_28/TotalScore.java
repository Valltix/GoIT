package module_6.task_28;

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;

        for(int scope: scores){
            result+=scope;
        }

        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
