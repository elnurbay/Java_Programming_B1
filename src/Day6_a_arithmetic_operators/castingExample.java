package Day6_a_arithmetic_operators;

public class castingExample {
    public static void main(String[] args) {
        short numOne = 40;
        float numTwo = numOne; // short is smaller than float, so no casting is needed from us
        char letter=  'A';
        int letter2= letter;
        System.out.println(letter2);

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3; // float is bigger, so we cast down to short

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300; // 300 is int by default, at it automatically goes up to float
        byte num6 = (byte)num5;





    }
}



