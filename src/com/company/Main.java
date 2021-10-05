package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many sides does your dice have? ");
        int sidenum = input.nextInt();
        System.out.println("how many rolls do you want to do? ");
        int rollnum = input.nextInt();
        for (int i = 0; i < rollnum; i++) {
            int max = sidenum;
            int min = 1;
            int diceroll = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Roll " + (i + 1) + " = " + diceroll);
            int count =(diceroll+2)-diceroll;
            if(diceroll == diceroll){
                count++;
            }
            System.out.println("dice rolled " + diceroll + " this many times " + count);
        }
    }
}
