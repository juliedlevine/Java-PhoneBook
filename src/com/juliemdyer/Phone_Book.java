package com.juliemdyer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone_Book {
    private Map<String, String> entries;
    private Scanner user_input;

    public Phone_Book() {
        entries = new HashMap<>();
        user_input = new Scanner(System.in);
    }

    public void getEntries() {
        if (entries.size() == 0) {
            System.out.printf("Phonebook is empty.%n%n");
        } else {
            System.out.println("Here are your phonebook entries:");
            for (String key : entries.keySet()) {
                String value = entries.get(key);
                System.out.printf("%s: %s%n", key, value);
            }
            System.out.printf("%n%n");
        }

    }

    public void addEntry() {
        System.out.println("Enter the name: ");
        String name = user_input.next();
        System.out.println("Enter the phone number: ");
        String number = user_input.next();
        entries.put(name, number);
        System.out.printf("Added entry for %s.%n%n", name);
    }

    public void deleteEntry() {
        if (entries.size() == 0) {
            System.out.printf("Phonebook is empty.%n%n");
        } else {
            System.out.printf("Who do you want to delete?%n");
            for (String name : entries.keySet()) {
                System.out.printf("-- %s%n", name);
            }
            System.out.printf("Enter your choice:  %n");
            String choice = user_input.next();
            entries.remove(choice);
            System.out.printf("Removed %s from Phonebook.%n%n", choice);
        }
    }

    public String showMenu() {
        System.out.printf("+++++++++++++++++++++++++%n" +
                "1. Show Phonebook Entries%n" +
                "2. Add an Entry%n" +
                "3. Lookup an Entry%n" +
                "4. Delete an Entry%n" +
                "5. Exit Phonebook%n" +
                "+++++++++++++++++++++++++%n%n");
        System.out.println("What do you want to do?  ");
        String choice = user_input.next();
        return choice;
    }

    public void lookupEntry() {
        if (entries.size() == 0) {
            System.out.printf("Phonebook is empty.%n%n");
        } else {
            System.out.println("Enter the name of the entry you'd like to look up:  ");
            String lookUp = user_input.next();
            Boolean found = false;

            for (String name : entries.keySet()) {
                if (name.equals(lookUp)) {
                    System.out.printf("Entry for %s found.%n", name);
                    System.out.printf("%s: %s%n%n", lookUp, entries.get(name));
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }

            if (found == false) {
                System.out.printf("No entry found.%n%n");
            }

        }
    }


}
