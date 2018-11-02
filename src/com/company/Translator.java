package com.company;

public class Translator {

    public Translator() { }

    public void prog_start() {
        System.out.println("public class My_e2j{");
        System.out.println("public static void main(String[] args{" );
    }
    public void prog_end() {
        System.out.println("}");
        System.out.println("}");
    }
}
