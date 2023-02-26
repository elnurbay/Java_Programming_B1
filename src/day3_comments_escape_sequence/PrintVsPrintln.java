package day3_comments_escape_sequence;

public class PrintVsPrintln {
    public static void main(String[] args) {
        //The below code prints this code--> i like "Java" programming
        System.out.println("I like Java programming");
        System.out.println("I like \"Java\" programming");

        //can you print " for me?
        System.out.println("\"");
        // how
        System.out.println("\\");
        System.out.println("\\\\");
        System.out.println("\'");
        //System.out.println("\n);
        //System.out.println("\t);

        System.out.println("apple");
        System.out.println("banana");
        System.out.println();
        System.out.println("pear");


        System.out.print("orange  ");
        System.out.println("dog");

    }
}
