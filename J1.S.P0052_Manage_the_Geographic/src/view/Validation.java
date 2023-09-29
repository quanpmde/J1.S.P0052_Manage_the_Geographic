/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Country;

/**
 *
 * @author Admin
 */
public class Validation {
    
    private final static Scanner sc = new Scanner(System.in);
    
    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input float limit
    public static float checkInputFloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number float");
                System.out.print("Enter again: ");
            }
        }
    }

    //check country exist by code
    public static boolean checkCountryExist(ArrayList<Country> countries, String countryCode) {
        for (Country country : countries) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
}
