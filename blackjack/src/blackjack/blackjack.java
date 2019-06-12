package blackjack;

import java.util.Random;
import java.util.Scanner;

public class blackjack {

    public static void main(String[] args) {
        System.out.println("hi welcome to julian's game");
        System.out.println("how much money do you want to put into the pot (curancy is euros)");
        Scanner SC = new Scanner(System.in); //SC is the scanner for everything.
        int euro = SC.nextInt();
        
        while(true){
         if (euro<0){
            System.out.println("you dont have any money left");
            break;
         }   
        System.out.println("how much do you want to bet. you have "+euro+" euros");
        int bet = SC.nextInt();
        euro=euro-bet;
        Random rand = new Random();
        


        String[] cards = {"ace of Clubs","ace of Diamonds","ace of Hearts","ace of Spades"," 2 of Clubs","2 of Diamons","2 of Hearts","2 of Spades","3 of Clubs","3 of Diamonds","3 of Hearts","3 of Spades","4 of Clubs","4 of Diamonds","4 of Hearts","4 of Spades","5 of Clubs","5 of Diamonds","5 of Hearts","5 of Spades","6 of Clubs","6 of Diamonds","6 of Hearts","6 of Spades","7 of Clubs","7 of Diamonds","7 of Hearts","7 of Spades","8 of Clubs","8 of Diamonds","8 of Hearts","8 of Spades","9 of Clubs","9 of Diamonds","9 of Hearts","9 of Spades","10 of Clubs","10 of Diamonds","10 of Hearts","10 of Spades","Jack of Clubs","Jack of Diamonds","Jack of Hearts","Jack of Spades","Queen of Clubs","Queen of Diamonds","Queen of Hearts","Queen of Spades","King of Clubs","King of Diamonds","King of Hearts","King of Spades"};
        String card = cards[rand.nextInt(52)];
        System.out.println(card);
        
        int card1 = rand.nextInt(11);
        int card2 = rand.nextInt(11);
        
        int dcard1 = rand.nextInt(11);
        int dcard2 = rand.nextInt(11);
        
        System.out.println("your bet this much "+bet);
        System.out.println("your have "+euro+" euros left");
        System.out.println(" ");
        System.out.println("you got a "+card1+" and "+card2);
        System.out.println("your dealer has a "+dcard1+" and a nother card.");
        int total=card1+card2;
        
       
            
            while(true){
            System.out.println("you got a total of "+total+" would you like to hit or stand");    
            String answer = SC.next(); 
            if ("hit".equals(answer)){
              int card3 = rand.nextInt(11);
              System.out.println("you got a "+card3+" and now your total was is "+total);
              total=total+card3;
             }
            else{
                break;
            }
            
            }
         System.out.println("you have "+total+" in total");
         int dtotal = dcard1+dcard2; 
         System.out.println("the dealer has "+dcard1+" and "+dcard2+" and the total is "+ dtotal);
         if (total>21){
             System.out.println("you Lose");
         }
         else if(dtotal<total){
            System.out.println("you Win");
            int theWin =bet*2;
            System.out.println("you get "+theWin+" euros");
            euro=euro+theWin;
            System.out.println("now you have "+euro+" euros");
        }
         else if (dtotal>total){
             System.out.println("you lose");
         }
         else{
             System.out.println("pare (no one wins)");
         }
        }

    }   
}

