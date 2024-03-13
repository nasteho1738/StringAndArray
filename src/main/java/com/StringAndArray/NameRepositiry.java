package com.StringAndArray;

public class NameRepositiry {
    private static String[] names = new String[10];
    private static int currentIndex = 0;


    public static String find(final String fullName) {
        for (int i = 0; i < currentIndex; i++) {
            if (names [i].equals(fullName)) {
                return names[i];
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        for (int i = 0; i < currentIndex; i++) {
            if (names[i].equals(fullName)) {
                return false;
            }
        }
        if (currentIndex < names.length) {
            names [currentIndex] = fullName;
            currentIndex++;
            return true;
        } else {
            System.out.println("Array is full. Cannot add more names.");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(add("Erik Svensson"));
        System.out.println(find("Erik Svensson"));
        System.out.println(add("Erik Svensson"));
    }
}
