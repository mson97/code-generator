package com.company;

public class Translator {

    public Translator() { }

    public void prog_start() {
        System.out.println("public class My_e2j{");
        System.out.println("public static void main(String[] args){" );
    }
    public void prog_end() {
        System.out.println("}");
        System.out.println("}");
    }

    public void blk_start() {
        System.out.println("{");
    }

    public void blk_end() {
        System.out.println("}");

    }

    public void decl(String id) {
        System.out.println("int x_" + id + ";");
    }
    public void asmt(String id, String expr) {
        System.out.println("x_" + id + " = " + expr + ";");
    }

    public void while_cond(String cond) {
        System.out.println("while ( (" + cond + ") <= 0) {");
    }

    public void print(String output) {
        System.out.println("System.out.println(" + output + ");");
    }
    public void expr(String output) {
        System.out.println(output + ";");
    }

}
