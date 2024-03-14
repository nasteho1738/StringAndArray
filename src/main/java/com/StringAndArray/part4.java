package com.StringAndArray;

public class part4 {
    private static String[] names = {"John Doe", " Jane Smith", "Alice Johnson", "Bob Brown"};


    public static boolean remove(final String fullName) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(fullName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        String[] newNames = new String[names.length - 1];
        for (int i = 0, k = 0; i < names.length; i++) {
            if (i != index) {
                newNames[k++] = names[i];
            }
        }
        names = newNames;
        return true;
    }
}
