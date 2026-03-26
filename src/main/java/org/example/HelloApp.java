package org.example;
public class HelloApp {

    public static void main(String[] args) {

        // UC5
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Use StringBuilder for building names
            StringBuilder names = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}
