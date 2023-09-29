/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import java.util.ArrayList;
import model.Country;
import view.Menu;

/**
 *
 * @author Admin
 */
public class ManageEastAsiaCountries extends Menu {
    
    private static ArrayList<Country> arr = new ArrayList();

    public ManageEastAsiaCountries() {
    }

    public ManageEastAsiaCountries(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                Algorithm.addCountryInformation(arr);//Enter the information for 11 countries in Southeast Asia.
                break;
            case 2:
                Algorithm.getRecentlyEnteredInformation(arr);//Display already information
                break;
            case 3:
                Algorithm.searchInformationByName(arr);//Search the country according to the entered country's name
                break;
            case 4:
                Algorithm.sortInformationByAscendingOrder(arr);//Display the information increasing with the country name
                break;
            case 5: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
        }
    } 
    
    
}
