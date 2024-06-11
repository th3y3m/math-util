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
//        long product = 1;
        //update code again to see green
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n-1);
        //recursion - đệ quy - gọi lại chính mình với 1 quy mô khác
        
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        return product;
    }
}
//5!    = 1.2.3.4.5
//      = 5 . 4!
//4!    = 1.2.3.4
//      4 . 3!
//3!    = 3 . 2!
//2!    = 2 . 1!

//Nếu ta xài CI trong PROJECT, thì lợi điểm là mỗi lần sửa CODE, dân DE ko cần mất sức TEST lại CODE của mình dúng sai, do cơ chế tuẹ động
//RUN TEST CASES của CI lo

//Toàn bộ việc TEST lai jCODE đc tự động hóa, PM, DEV, chỉ cần nhìn màu xanh là đủ, biết rằng việc sửa CODE ngon, vì PASS đc bộ TEST

//Việc TEST
