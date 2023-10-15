package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        if (t == 0) {
            System.out.println(0);
            return;
        }
        while(t != 0) {
            if (t < 0) {
             t *= -1;
            }
            int digit = t % 10;
            sum += digit;
            t /=10;
        }
        System.out.println(sum);
    }
}
