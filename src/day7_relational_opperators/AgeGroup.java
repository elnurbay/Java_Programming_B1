package day7_relational_opperators;

public class AgeGroup {
    //public static void main(String[] args) {
        /*
    task:
        declare and assign an age variable
        is the person a kid ( up to 13, include 13)
        is the person a senior citizen ( 65 and above)
     */

        public static void main(String[] args) {

            int age = 13; // rename age with rafactor

            boolean isKid = age <= 13;
            boolean isSenior = age >= 65;

            System.out.println("You are a kid: " + isKid);
            System.out.println("You are a senior citizen: " + isSenior);



        }
}
