package day7_relational_opperators;

public class GiftCard {
//            +=
//            -=
//            *=
//            /=
//            %=


//    Ex:
//    int number = 50;
//    number = number + 50;  < ---- > number += 50;
//
//    number = number * 10;  < ---- > number *= 10;
//
//    number = number - 20;  < ---- > number -= 20;



     /*
    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card
        100
        40
        --------------------------------------
        buy item1 for 50
        buy item2 for 100
        print out the remaining
     */

    public static void main(String[] args){

          double giftCard=300;
          String item1= "Dior";
          String item2 = "Chanel";
        System.out.println(" I have $ "+ giftCard +"worth of gift card.");


        //giftCard = giftCard-50;
        giftCard-=50;
        System.out.println( "After buying " +item1 + "I heve left " + giftCard+"amount in gift card");

        giftCard-=100;
        System.out.println( "After buying " +item2 + "I heve left " + giftCard+"amount in gift card");



//            double giftCard = 200;
//            System.out.println("Buy item 1 for 100$");
//            giftCard -= 100.50; // giftCard = giftCard - 100;
//
//            System.out.println("Buy item 2 for 40$");
//            giftCard -= 40; // giftCard = giftCard - 40;
//
//            System.out.println("Your gift card balance is now: " + giftCard);
//
// multiply  gift card balance by 2
        giftCard*=2;
        System.out.println(giftCard);
        }


}
