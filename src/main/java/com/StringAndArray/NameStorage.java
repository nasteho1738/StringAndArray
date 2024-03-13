package com.StringAndArray;


public class NameStorage {
    private String[] names = new String[10];
    private int currentIndex = 0;



    public void addName(String firstName, String lastName) {
        if (currentIndex < names.length) {
            names[currentIndex] = firstName + " " + lastName;
            currentIndex++;
        } else {
            System.out.println("Array is full. Could not add more names.");
        }
    }

    public void displayNames() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(names[i]);
        }
    }


    public static void main(String[] args) {
        NameStorage nameStorage = new NameStorage();
        nameStorage.addName("Erik", "Svensson");
        nameStorage.addName("John", "Doe");
        nameStorage.displayNames();
    }
}


