/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.Scanner;

/**
 *
 * @author SebuhiMv
 */
public class Helper {

    public static int tryParseInt(String choice) {
        int input = 0;

        try {
            input = Integer.parseInt(choice);
        } catch (Exception e) {
            System.out.println("\nEnter number");
        }

        return input;
    }

    public static boolean isValidString(String input) {
        return input != null && !input.isEmpty() && !input.isBlank() && input.matches("^[a-zA-Z]+$");
    }

    public static boolean isValidNumber(int num) {
        return num > 0;
    }

//    public static boolean isValidInteger(String input) {
//        try {
//            Integer.parseInt(input);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//
//    }

    
//    public static boolean isValidStr(String str){
//        return str instanceof String;
//    }
}
