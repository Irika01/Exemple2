package com.company;

import com.company.test.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live?");
        String address = br.readLine();

        System.out.println("Hello " + name);
        System.out.println("I live in " + address);
    }
}
