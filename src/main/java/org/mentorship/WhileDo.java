package org.mentorship;

public class WhileDo {
    static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int payment = 10000;
        int years = 0;
        double interestRate = 0.01;

        do  {
            currentBalance += payment;
            years++;
            System.out.println("Year " +years+"  - " +currentBalance );
        } while (currentBalance < finalBalance && years < 10);
    }
}

