public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int steps = 0;

        while (start > 0){
            boolean even = start % 2 == 0;
            boolean odd = start % 2 != 0;

            if (even){
                start = start / 2;
                steps++;
            }

            if (odd) {
                start--;
                steps++;
            }
        }

        System.out.println(steps);
    }
}
