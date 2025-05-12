package com.company;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class Guess{


     private static int comp ;
     private int tries=0;
     Boolean valid = false;
     Scanner sc= new Scanner(System.in);


    static {
      Random rand  = new Random();
      comp = 1+ rand.nextInt(100);            //rand.next will range from 0-99  , adding 1 makes it 1-100;
    }

    public int guessNum(){
        tries++;

        int guss =0;

        try {
            guss = sc.nextInt();
        }
        catch (Exception e) {
            return -1;

        }

        return guss;

    }
    public boolean valid(int input){


        if(input==comp){
            System.out.print("Correctly guessed " +comp + " in "+ tries + " tries");
            return true;
        }
        else if (input > comp && input<=100){
            System.out.print("Guess lower : ");

        }
        else if(input<comp && input>=1){
            System.out.print("Guess higher : ");

        }
        else if(input>100 || input<1){
            System.out.println("INVALID INPUT :: ONLY GUESS BETWEEN 1 TO 100");
            System.out.print("Now guess again : ");

        }

        return false;
    }

    public void play(){
        System.out.println("GUESS THE NUMBER BETWEEN 1 TO 100 GAME ");
        System.out.println();
        System.out.print("Guess number : ");


        while(!valid){

            int input=  guessNum();
            valid = valid(input);

        }
    }



}
public class guess_the_num_using_class {


    public static void main(String[] args) {

        Guess obj = new Guess();
        obj.play();



     }
}
