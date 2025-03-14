/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.szamalk.ehcararend;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class EhCaraRend {

    public static void main(String[] args) {
        int[] items = new int[]{133,13,73,52,66,2,78,99,42,5};
        megjelenit(items);
        System.out.println("");
        items = maxKupac(items);
        System.out.println("");
        megjelenit(items);
    }
    
    public static void megjelenit(int[] items){
        for (int item : items) {
            System.out.println(item);
        }
    }
    
    public static int[] maxKupac(int[] items){
        int temp;
        for (int k = items.length, c = 1; k >= 0; k--, c++) {
            for (int i = (k/2)-1; i >= 0; i--) {
               // System.out.println("i: "+i);
                for (int j = 0; j < 2; j++) {
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
