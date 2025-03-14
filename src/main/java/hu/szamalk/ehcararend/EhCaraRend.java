/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.szamalk.ehcararend;

import hu.szamalk.model.KupacRend;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class EhCaraRend {

    public static void main(String[] args) {
        int[] items = new int[]{133,13,73,52,66,2,78,99,42,5,6};
        megjelenit(items);
        System.out.println("");
        items = KupacRend.maxKupac(items);
        System.out.println("");
        megjelenit(items);
    }
    
    public static void megjelenit(int[] items){
        for (int item : items) {
            System.out.println(item);
        }
    }
}
