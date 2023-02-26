package day7_relational_opperators;

public class UpdatedVariables {
    public static void main(String[] args) {

        //  int a = 10;  // declared and assigned value
        //        a = 11;      // reassign.
        //
        //        // a = a + 1;
        //        a++;         // reassign a = a + 1;   --- > 12
        //        //System.out.println(a++);   // 11
        //        System.out.println(a);      // 12
        //
        //
        //        ++a;         // reassign a = a + 1;
        //        System.out.println(a);     // 13
        //
        //        int x  = 10;
        //        x = x + 4;     //14
        //
        //        x += 4;
        //        System.out.println(x);   //

        // adding 1 to a variable
        int a = 10;
        a = 11;
        a++;
        ++a;
        a = a + 1;

        // add 10 to the variable

        int b = 4;
        // 10 times I write b++;
        b = 14;
        b = b + 10; // reads the value of b, adds 10 to it, then the result is store back into b by reassigning
        b += 10; // this code is the same as --> b = b + 10;

        int count = 0;
        count += 5; // count = count + 5;
        System.out.println(count);
        count -= 10; // count = count - 10;
        System.out.println(count);
        count *= 2;
        System.out.println(count);



    }
}