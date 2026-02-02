package org.mentorship;

public class ForLoop {
    static void main(String[] args) {
        int i = 10;
        int j = 2;
        for (int k = 0; k < i; k++) {
            System.out.println("mimimi " + k);
        }

        System.out.println("i = " + i + " j = " + j);

        for (int k = 0; k >= j; k--) {
            System.out.println("mimimi " + k);
        }
        int k = 0;
        while (k < j) {
            System.out.println("mimimi " + k);
            k++;
        }
    }
}
