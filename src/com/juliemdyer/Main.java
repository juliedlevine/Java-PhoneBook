package com.juliemdyer;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Phone_Book myPhoneBook = new Phone_Book();
        String choice = "";
        do {
            choice = myPhoneBook.showMenu();
            if (choice.equals("1")) {
                myPhoneBook.getEntries();
            } else if (choice.equals("2")) {
                myPhoneBook.addEntry();
            } else if (choice.equals("3")) {
                myPhoneBook.lookupEntry();
            } else if (choice.equals("4")) {
                myPhoneBook.deleteEntry();
            }
        } while (!choice.equals("5"));


    }
}
