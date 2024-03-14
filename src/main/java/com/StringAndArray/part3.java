package com.StringAndArray;

import java.util.Arrays;

public class part3 {
    private static String[] names = {"John Doe", " Jane Smith", "Alice Johnson", "Bob Brown"};

    public static String[] findByFirstName(final String firstName) {
        return Arrays.stream(names)
                .filter(name -> name.split(" ")[0].equalsIgnoreCase(firstName))
                .toArray(String[]::new);
    }

    public static String[] findByLastName(final String lastName) {
        return Arrays.stream(names)
                .filter(name -> name.split(" ")[1].equalsIgnoreCase(lastName))
                .toArray(String[]::new);
    }

    public static boolean update(final String[] original, final String updatedName) {
        if (Arrays.asList(names).contains(original)) {
            int index = Arrays.asList(names).indexOf(original);
            if (!Arrays.asList(names).contains(updatedName)) {
                names[index] = updatedName;
                return true;
            }
        }
        return false;
    }

}
