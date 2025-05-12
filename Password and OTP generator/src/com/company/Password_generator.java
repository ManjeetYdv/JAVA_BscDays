package com.company;

import java.util.Random;

public class Password_generator {             //Generated a 8 digit strong password

    public String password(){

        String caps="";
        char c ='A';
        for(int i=1 ;i<=26 ;i++){
            caps+=c++;
        }

        String smalls="";
        char s ='a';
        for(int i=1 ;i<=26 ;i++){
            smalls+=s++;
        }

        String nums ="0123456789";
        String specialChar ="@#$%&";

        String values =caps+smalls+nums+specialChar;

        Random random = new Random();

        String pswd ="";

        for(int i=0 ;i<8;i++){
            pswd+=values.charAt(random.nextInt(values.length()));
        }

        return pswd;


    }
}
