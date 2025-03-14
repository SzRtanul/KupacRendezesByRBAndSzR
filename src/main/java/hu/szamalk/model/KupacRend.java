/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.model;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class KupacRend {
    public static int[] maxKupac(int[] items){
        int temp;
        for (int k = items.length, c = 1; k >= 0; k--, c++) {
            for (int i = (k/2)-1; i >= 0; i--) {
               // System.out.println("i: "+i);
                for (int j = 1; j <= 2; j++) {
                    //System.out.println("j: " + j);
                   // System.out.println("Keplet: " + (int)(2 * i + j));
                    temp = items[i];
                    boolean b = items[i] < items[2*i+j];
                    items[i] = b ? items[2*i+j] : items[i];
                    items[2*i+j] = b ? temp : items[2*i+j];
                }
                temp = items[0];
                items[0] = items[items.length-c];
                items[items.length-c] = temp;
            }
        }
        return items;
    }
}
