/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Collections;
import model.Country;
import model.EastAsiaCountries;
import view.Validation;
/**
 *
 * @author Admin
 */
public class Algorithm {
    
    //allow user input infomation of contries
    public static void addCountryInformation(ArrayList<Country> countries) {
        System.out.print("Enter code of country: ");
        String countryCode = Validation.checkInputString();
        
        //check code contry exist or not
        if (!Validation.checkCountryExist(countries, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        
        System.out.print("Enter name of country: ");
        String countryName = Validation.checkInputString();
        System.out.print("Enter total area: ");
        float countryArea = Validation.checkInputFloat();
        System.out.print("Enter terrain of country: ");
        String countryTerrain = Validation.checkInputString();
        countries.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }
    
    
    //display infomation of country
    public static void getRecentlyEnteredInformation(ArrayList<Country> countries) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area","Terrain");
        for (Country country : countries) {
            country.display();
        }
    }
    
    //allow user search infomation contry by name
    public static void searchInformationByName(ArrayList<Country> countries) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = Validation.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area","Terrain");
        for (Country country : countries) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }
    
    //display infomation sort name in ascending
    public static void sortInformationByAscendingOrder(ArrayList<Country> countries) {
        Collections.sort(countries);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area","Terrain");
        for (Country country : countries) {
            country.display();
        }
    }

}
