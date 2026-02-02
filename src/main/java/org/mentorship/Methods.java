package org.mentorship;

public class Methods {
    public static void main(String[] args) {
        printMessage("Vira");

        int a = 5;
        int b = 10;

        String name = "Vira";
        String surname = "Omelchuk";
        calcRectangleSquare(a, b);
    }

    private static void printMessage(String vira) {

    }


    static void printMessage(String name , String surname ){
        System.out.println("Kyky " + name + surname );
    }

    static void calcRectangleSquare(int x, int y){
        int square = x * y;
        System.out.println("Rectangle square = " + square);
    }



}


