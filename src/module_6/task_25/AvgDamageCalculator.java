package module_6.task_25;

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        //if (samples.length == 0)return 0;
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }
        try {
        return sum / samples.length;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}
