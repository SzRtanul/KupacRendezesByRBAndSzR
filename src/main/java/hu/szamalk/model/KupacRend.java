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
        for (int k = items.length, c = 1; k > 1; k--, c++) {
            System.out.println("k: "+k);
            for (int i = (k/2) - 1; i >= 0; i--) {
                System.out.println("i: "+i);
                for (int j = 0; j < 2; j++) {
                    System.out.println("j: " + j);
                    System.out.println("Keplet: " + (int)(2 * i + j));
                    System.out.println("EREDETI: " + items[i] + ":" +items[2*i+j]);
                    temp = items[i];
                    boolean b = items[i] < items[2*i+j];
                    items[i] = b ? items[2*i+j] : items[i];
                    items[2*i+j] = b ? temp : items[2*i+j];
                    System.out.println("CSERE: " + items[i] + ":" +items[2*i+j]);
                }
            }
            System.out.println("ECSERE: " + items[0] + ":" +items[items.length-c]);
            temp = items[0];
            boolean b = items[0] > items[items.length-c];
            items[0] = b ? items[items.length-c] : items[0];
            items[items.length-c] = b ? temp : items[items.length-c];
            System.out.println("TCSERE: " + items[0] + ":" +items[items.length-c]);
        }
        return items;
    }
}
