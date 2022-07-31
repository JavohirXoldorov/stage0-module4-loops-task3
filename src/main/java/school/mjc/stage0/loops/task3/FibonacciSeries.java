package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 1, c = 1, cnt = 1;
        if (cnt <= lastFibonacci) System.out.println(0);
        cnt++;
        if (cnt <= lastFibonacci) System.out.println(1);
        cnt++;
        if (cnt <= lastFibonacci) System.out.println(1);
        cnt++;
        for (int i = 4; i <= lastFibonacci; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }
}
