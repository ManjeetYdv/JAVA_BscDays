package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Font;
import javax.imageio.*;
import java.io.*;



public class guess_the_num extends Frame {
    Frame frame;
    Label but;
    Label label;
    TextField guessnum;
    TextField showResult;
    TextArea finalresult;
    Label high;
    TextField highscore;

    Button but1;
    int numOfGuesses;
    int guess;
    int guessedNum;
    int comp;
    Label result;
    Image img =ImageIO.read(new File("gues.jpeg"));
    Button but2;
    Button but3;


    Random ran = new Random();


    guess_the_num() throws IOException {


        Random ran  = new Random();
        comp = ran.nextInt(100)+1;
        numOfGuesses=0;

        but = new Label("Guess the num bw 1-100 ");
        but.setBounds(250, 150, 150, 30);
        add(but);
        repaint();


        label = new Label("Guess The Number Game");
        label.setBounds(165,30,300,30);
        Font fn = new Font("Arial" , Font.PLAIN , 25);
        label.setFont(fn);
        add(label);

        guessnum = new TextField();
        guessnum.setBounds(400, 150, 100, 30);
        add(guessnum);

        but1 = new Button("Check");
        but1.setBounds(400, 180,50, 30);
        add(but1);

        but2 = new Button("Play again");
        but2.setBounds(340, 300,80, 30);
        add(but2);

        but3 = new Button("EXIT GAME");
        but3.setBounds(425, 300,80, 30);
        add(but3);

        result = new Label("Result");
        result.setBounds(350 , 220 ,40,30);
        add(result);

        high =  new Label("Best Score");
        high.setBounds(400, 60 , 80 ,60);
        Font sd = new Font("Arial" , Font.PLAIN , 15);
        high.setFont(sd);
        add(high);

        highscore = new TextField();
        highscore.setText("100");
        highscore.setBounds(485 , 80 ,30 , 30);
        add(highscore);

        finalresult = new TextArea();
        finalresult.setBounds(400,200,150,40);

        showResult = new TextField();
        showResult.setBounds(400,220,150 , 30);
        add(showResult);

        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                guessnum.setText("");
                showResult.setText("");
                comp = ran.nextInt(100)+1;
            }
        });


        but1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int highscoree = 100;
                int n1 = Integer.parseInt(guessnum.getText());
                if(n1>comp){
                    showResult.setText("Guess lower than "+n1+" ");
                    guessnum.setText("");
                    numOfGuesses++;

                }
                if(n1<comp){
                    showResult.setText("Guess higher than "+n1);
                    guessnum.setText("");
                    numOfGuesses++;
                }
                if(n1==comp){


                    showResult.setText("WON....took u "+ (numOfGuesses+1)+" attempts");
                    finalresult.setText("You guessed "+comp+" in "+numOfGuesses+" attempts");
                    if(numOfGuesses<highscoree){
                        highscoree =  numOfGuesses+1;
                        String xyz  = Integer.toString(highscoree);
                        highscore.setText(xyz);
                    }
                    highscoree = numOfGuesses+1;
                }
            }
        });






        setSize(600, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


    }


    public void paint(Graphics g){

        g.drawImage(img, 0, 0 , null);
    }


}