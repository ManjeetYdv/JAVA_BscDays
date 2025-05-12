package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
     OTP_Generator otp = new OTP_Generator();
        System.out.println("New OTP : " +otp.new_otp());

        Password_generator pswd = new Password_generator();
        System.out.println("New password : "+pswd.password());


        int comp;

        try{
            Scanner sc= new Scanner(System.in);
            comp = sc.nextByte();

        }
        catch (Exception e){
            System.out.println("Invalis int "
            );
        }




    }
}
