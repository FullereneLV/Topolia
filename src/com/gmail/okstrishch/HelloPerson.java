package com.gmail.okstrishch;

import java.util.Scanner;

public class HelloPerson {

    public void helloPerson(String name) {
        System.out.print("Hello " + name);

    }

    public static String scanner() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Writing Name, please: ");
        String name = enter.nextLine();
        enter.close();
        return name;
    }

    public static void main(String[] args) {

        HelloPerson person = new HelloPerson();
        person.helloPerson(scanner());

    }

}
