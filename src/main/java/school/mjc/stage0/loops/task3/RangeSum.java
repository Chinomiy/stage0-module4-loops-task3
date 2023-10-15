package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if (firstBoarder < 0 || secondBoarder < 0) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
