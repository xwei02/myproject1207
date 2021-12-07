package com.sylvie;

import java.util.Random;
import java.util.Scanner;

public class Guess1To20 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(20)+1;
        Scanner scanner = new Scanner(System.in);
        int min =1;
        int max = 20;
        boolean win = false;
        for (int i=0;i<3;i++){
            System.out.println("please enter a number"+min+"~"+max);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num>secret){
                max = num;
            }else if (num<secret){
                min = num;
            }else {
                win = true;
                break;
            }

            }
        if (win){
            System.out.println("You win!");
            System.out.println(secret);
        }else {
            System.out.println("You loose!");
            System.out.println(secret);
        }

        }
    }

