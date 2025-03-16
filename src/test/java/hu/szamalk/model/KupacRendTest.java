/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.model;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author SzabóRoland(SZF_2023
 */
public class KupacRendTest {
    
    static Stream<int[]> provideArrays() {
        return Stream.of(
            new int[0],
            new int[]{1},
            new int[]{1,2},
            new int[]{2,1},
            new int[]{3,2,1},  
            new int[]{1, 2, 3},
            new int[]{4, 5, 66, 5, 4, Integer.MAX_VALUE, Integer.MIN_VALUE},
            new int[]{133,13,73,52,66,2,78,99,42,5,6}
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void testArrays(int[] input) {
        input = KupacRend.maxKupac(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        for (int i = 0; i < input.length-1; i++) {
            System.out.println("YEEEE: "+input[i]);
            Assertions.assertEquals(input[i] <= input[i+1], true);
        }
    }
}
