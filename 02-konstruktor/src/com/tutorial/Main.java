package com.tutorial;

class Polos{
    String dataString;
    int dataInteger;
}


public class Main {

    public static void main(String[] args) {
        // instansiasi objek
        Polos pls = new Polos();

        // memberi nilai pada objek pls
        pls.dataString = "polos";
        pls.dataInteger = 110;

        System.out.println("dataString : " + pls.dataString);
        System.out.println("dataInteger : " + pls.dataInteger);

    }
}