/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mathutil.main;
//Quy tắc đặt tên trong package trong JAVA
//- chữ thường toàn tập

import com.mycompany.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

//- ghi theo tên miền công ty
//com.ten-cty.ten-du-an.ten-module-nhom-chuc-nang
//com.microsoft.sqlserver.jdbc
/**
 *
 * @author admin
 */
public class MathUtil {
    //modify code in local, later upload to server
    public static void printMsg(){
        
    }
//MODIFY CODE DIRRECTLY IN SERVER - TO SIMULATE A CASE 

    public static void F(){
    }

    
//    public static void main(String[] args) {
//        //TEST CASE #01
//        //N = 0, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        int n = 0;
//        long expectedValue = 1; //Hy vong 0! = 1
//        long actualValue;// = ? cho ham tra ve
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | Expected: " + expectedValue + ", Actual: " + actualValue);
//        
//        //TEST CASE #02
//        //N = 1, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue + ", Actual: " + actualValue);
//        
//        //TEST CASE #03
//        //N = 5, EX VALUE: 120, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + ", Actual: " + actualValue);
//        
//        //TEST CASE #04
//        //N = -1, EX VALUE: Thấy Ngoại lệ, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        System.out.println("Check if the Illegal Aegument Exception is throw");
//        n = -1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("-1! | Expected: " + expectedValue + ", Actual: " + actualValue);
//    }
    
    public static void main(String[] args) {
        //CÁCH 2: TEST hàm = cách POPUP
        
        int n = 0;
        long expectedValue = 1; //Hy vong 0! = 1
        long actualValue;// = ? cho ham tra ve
        actualValue = MathUtility.getFactorial(n);
        
        String result = n + "! | EX: " + expectedValue + " | ACTUAL: " + actualValue;
        
        JOptionPane.showMessageDialog(null, result);
                
                
                      
    }
}
