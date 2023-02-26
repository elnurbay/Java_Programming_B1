package day7_relational_opperators;

public class OperatorPractice {
    public static void main(String[] args) {

        int i = 5;

        //      |  6  |  5  | 6 | 5
        int y = -i++ + --i + i++/i--;
        //      -5  +    5 + 5  /6
        // y = -5 +      5+    0: because 5/6 by default gives int
        //         - 5 + 5=0

        System.out.println(i);
        System.out.println(y);



    }
}
