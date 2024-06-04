/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathutil.core;

/**
 *
 * @author admin
 */
public class MathUtility {
    public static long getFactorial(int n){
        long product = 1;
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
