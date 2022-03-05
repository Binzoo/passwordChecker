/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passwordchecker;

import java.util.Scanner;

/**
 *
 * @author binamrathapa
 */
public class passwordChecker {
        public static void main(String[] args) {
        //this scanner will allow user to input their password
        Scanner password = new Scanner(System.in);

        String[] info = {"Please enter the password that most consist of: ", "• At least 8 characters long",
            "• Contain a capital letter", "• Contain a number", "• Contain a special character"};
        //this for loop is for displaying the message
        for (int i = 0; i < 5; i++) {
            System.out.println(info[i]);
        }

        //this code will store the password
        System.out.println("Your password here: ");
        String storePassword = password.nextLine();

        //this code my check if there is any capital letter in the password
        boolean check = true;

        String[] alphabate = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < 26; i++) {
            if (storePassword.contains(alphabate[i])) {
                check = true;
                break;
            } else {
                check = false;
            }
        }

        // this code will check if any number are there or not 
        boolean checkNum = true;

        String[] Number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        for (int i = 0; i < 10; i++) {
            if (storePassword.contains(Number[i])) {
                checkNum = true;
                break;
            } else {
                checkNum = false;
            }
        }

        // this code will check if any special charater are there or not 
        boolean checkspecialChar = true;

        String[] specialChar = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+",
            "=", "[", "]", ";", ":", "<", ">", "?", "/", "|", "\\", "'"};

        for (int i = 0; i < 23; i++) {
            if (storePassword.contains(specialChar[i])) {
                checkspecialChar = true;
                break;
            } else {
                checkspecialChar = false;
            }
        }

        //this code will check all the requiremets of the password
        if (storePassword.length() >= 8 && check == true && checkNum == true && checkspecialChar == true) {
            passwordSuccesfull();
        } else {
            passwordFailed();
        }

    }

    public static void passwordSuccesfull() {
        System.out.println("Your password meets all the requirements.");
    }

    public static void passwordFailed() {
        System.out.println("Your password does not meets with the requirements.");
    }
    
}
