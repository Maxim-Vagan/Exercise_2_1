package ru.maxvagan;

import java.util.Arrays;

public class Main {

    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValue2(Integer mainValue) {
        mainValue = 22;
    }

    private static void changeArrayValue(Integer[] inpArrayValue) {
        inpArrayValue = new Integer[]{1, 2};
    }

    private static void changeArrayValue2(Integer[] inpArrayValue) {
        inpArrayValue[0] = 99;
    }

    public static void main(String[] args) {
	    // task 5
        System.out.println("Task 5");
        int value = 33;
        System.out.println("value before void treatment = " + value);
        changeValue(value);
        System.out.println("value after void treatment = " + value);
        // task 6
        System.out.println("Task 6");
        Integer mainValue = 33;
        System.out.println("mainValue before void treatment = " + mainValue);
        changeValue2(mainValue);
        System.out.println("mainValue after void treatment = " + mainValue);
        // task 7
        System.out.println("Task 7");
        Integer[] arrayValue = {3, 4};
        System.out.println("arrayValue before void treatment = " + Arrays.toString(arrayValue));
        changeArrayValue(arrayValue);
        System.out.println("arrayValue after void treatment = " + Arrays.toString(arrayValue));
        // task 8
        System.out.println("Task 8");
        Integer[] arrayValue2 = {3, 4};
        System.out.println("arrayValue2 before void treatment = " + Arrays.toString(arrayValue2));
        changeArrayValue2(arrayValue2);
        System.out.println("arrayValue2 after void treatment = " + Arrays.toString(arrayValue2));
        // task 9
        System.out.println("Task 9");
        clsPerson person = new clsPerson("Lyapis", "Trubetskoy");
        System.out.println("Before changing person " + person);
        person.changePerson(person);
        System.out.println("After changing person " + person);
        // task 10
        System.out.println("Task 10");
        person.changePerson2(person);
        System.out.println("After changing2 person " + person);
    }
}
