public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(7));
    }

    public int climbStairs(int n) {
        int stepArray[] = new int[n + 1];
        stepArray[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 2 >= 0) {
                stepArray[i] = stepArray[i - 1] + stepArray[i - 2];
            } else {
                stepArray[i] = stepArray[i - 1];
            }

        }
        return stepArray[n];
    }
}
