package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int number = 9;
            for (int j = 2; j <= i; j++) {
                number *= 10;
                number += 9;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
