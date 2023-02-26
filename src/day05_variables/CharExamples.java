package day05_variables;

public class CharExamples {
    public static void main(String[] args) {

        char letterOne= 'a';
        char letterTwo='Z';

        char numberOne='9';
        char specialOne='$';
        int number=9;

//        System.out.println(numberOne);
//        System.out.println(number);
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne+letterTwo);


        System.out.println("result "+ letterOne+letterTwo);
        System.out.println(letterOne+letterTwo+"<----result--->"+ letterOne+letterTwo);

        System.out.println("<----String---> " + letterOne+letterTwo + "<----String---> " + letterOne+letterTwo);

        char letterThree=65;
        System.out.println(letterThree);
       // char letterFour='65';

    }
}
