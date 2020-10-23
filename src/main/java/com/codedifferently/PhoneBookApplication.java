package com.codedifferently;

import java.util.Scanner;

public class PhoneBookApplication {
    public static void main(String[] args){
        Scanner fred = new Scanner(System.in);
        System.out.println("Whats' your name?");
       String name = fred.next();
       System.out.println("Your name is " + name);

    }

}
