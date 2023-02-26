package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand ="apple";
        String model ="iphone 10";
        String color = "black";
        double price= 1000.99;
        int storage = 128;
        boolean hasCamera=true;
        char sim= 'A';
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);
        System.out.println(sim);
        System.out.println("I have an "+model + " from "+ brand);
        System.out.println("it came in the color "+ color+ " and it has "+storage + " GB ");
        System.out.println("For the sim type "+sim+ " with a camera "+ hasCamera+ " total price was "+ "$"+price);

    }
}
