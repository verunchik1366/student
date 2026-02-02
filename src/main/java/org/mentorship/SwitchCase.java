package org.mentorship;

public class SwitchCase {
    static void main(String[] args) {
        String dayOfWeek = "saturday";
        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                System.out.println("It's Monday!");
                break;
            case "tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "thursday":
                System.out.println("It's Thursday!");
                break;
            case "friday":
                System.out.println("It's Friday!");
                break;
            case "saturday":
                System.out.println("Weekend");
                break;
            case "sunday":
                System.out.println("Weeekend");
                break;
            default:
                System.out.println("Unknown day of the week.");
        }
        System.out.println("Done!");
    }
}
