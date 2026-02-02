package ui;

import org.testng.annotations.Test;

public class first {

    @Test
    public void checkArray() {
        double age = 15.9;
        String name = "Vira" + " is girl";
        boolean kotik = true;
        int a = 10;
        int b = 11;

        System.out.println("Вік: " + age);
        System.out.println("Ім'я: " + name);
        System.out.println("Котик: " + kotik);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Сума a + b = " + (a + b));
    }

    @Test
    public void testVariables() {
        String name = "бла бла бла";
        int age = 23;
        double holidaystime = 2500.75;
        boolean summer = true;

        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }

        System.out.println("String - бла: " + name);
        System.out.println("age: " + age);
        System.out.println("holidaystime: " + holidaystime);
        System.out.println("summer: " + summer);
    }

    @Test
    public void checkDayOfWeek() {
        System.out.println("Перевірка днів тижня");
        String dayOfWeek = "Monday";

        switch(dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Невідомий день");
        }

        System.out.println("Перевірка для 'Saturday':");
        dayOfWeek = "Saturday";
        switch(dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Невідомий день");
        }
    }

    @Test
    public void testForLoop() {
        System.out.println("Цикл");
        System.out.println("Числа від 1 до 5:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Парні числа від 1 до 10:");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    @Test
    public void testLinearSearch() {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(linearSearch(arr, 30)); 
        System.out.println(linearSearch(arr, 99)); 
        System.out.println(linearSearch(arr, 10)); 
    }

    private int linearSearch(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void testAllTogether() {
        System.out.println("Поєднати все разом");

        String[] days = {"Monday", "Saturday"};
        for(String day : days) {
            System.out.print(day + " - ");
            switch(day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.println("Робочий день");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Вихідний день");
                    break;
                default:
                    System.out.println("Невідомий день");
            }
        }

        System.out.println("Квадрати чисел 1-5:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + "² = " + (i * i));
        }

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(linearSearch(arr, 30));
        System.out.println(linearSearch(arr, 99));
        System.out.println(linearSearch(arr, 10));
    }
}


