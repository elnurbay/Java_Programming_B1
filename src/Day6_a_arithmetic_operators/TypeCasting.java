package Day6_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b=43;
        int i=b; //the byte value automaticlly converted to int because byte is smaller then int

        int i2 = 100;
        //byte b2=i2;
        byte b2 =(byte)i2; //reassigning check the data type first
        byte b3=100;// puting a value directly gives a datatype declared and first check the range

        System.out.println("b2 "+b2);
        System.out.println("b3 "+b3);

//        int i3 =130;
//        byte b4=(byte)i3;
//        System.out.println("b4"+b4);

//        int i3 =125;
//        byte b4=(byte)i3;
//        System.out.println("b4"+b4);
//
//        byte b = 40;
//        int i = b; // the byte value is automatically converted to int, because byte is smaller than int
//
//        int i2 = 100;
//        byte b2 = (byte) i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)
//
//        int i3 = 500;
//        long l1 = i3; // int is smaller than long, so it will automatically cast
//
//        long l2 = 200;
//        int i4 = (int)l2; // im trying to go from long to int. long is bigger than int, so i must cast it
//
//        long l3 = 10000000000000L;
//
//        double d = 50;
//        int i5 = (int)d; // trying to go from double type to int type. double is bigger, so i need to cast
//
//        System.out.println(d);
//        System.out.println(i5);
//
//        double d2 = 40;
       // byte b3 = (byte)d2;
       // byte b = 40;


        char letter1 =65;
        char letter2 ='A';
        System.out.println("letter1"+letter1);
        System.out.println("letter2"+letter2);

        byte b5='B';
        char num=(char)b5;
        System.out.println("num "+num);

        byte b6='8';
        int num2=b6;
        System.out.println("num2 "+num2);
        byte aa =5;
        char bb = (char)aa;
        System.out.println("bb "+bb);

        int i10= 500;
        long i1= i10;
        System.out.println("i10 "+i10);

        long i8=200;
        int i9=(int)i8;
        System.out.println("i9 "+i9);

        long i4=1_000_000_000_000L;
        int i7 = (int)i4;
        System.out.println(i4);
        System.out.println();
        double d= 50;
        System.out.println("d: "+d);
long l3= 10000000;
        int i11=(int)d;
        System.out.println(i11);


        int i12=200;
        double d2= i12;
        System.out.println("d2 "+d2);

    }
}
