package com.company;

import java.util.Random;

public class OTP_Generator {             //Generated a 4-digit OTP

    public int new_otp(){

        String nums ="0123456789";
        String otp ="";

        Random random = new Random();

        for(int i=0 ;i<4 ;i++){

            otp+= nums.charAt(random.nextInt(nums.length()));
        }

        return Integer.parseInt(otp);
    }
}
