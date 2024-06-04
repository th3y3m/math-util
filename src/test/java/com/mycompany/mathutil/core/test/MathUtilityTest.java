/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mathutil.core.test;

//Quy tắc đặt tên package trong JAVA tên miền đảo ngược đi kèo thông tin Project và modul tôl
//com.tên-cty.tên-dự-án.modul.tên-class
//com.microsoft.sqlserver.jdbc
//
import com.mycompany.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class MathUtilityTest {

    //Test case là bộ data đầu vào + thao tác nhập xuất trên app, màn hình, trên hàm để verify 1 hàm, màn hình, chức năng chạy đúng hay sai ! PE
    
    //Test Case #1: Check/Test getF() ưith n = 0
    // * Input/Given n = 0
    // * Steps/Procedure (bước test)
    //call method getFactorial(n)
    // * Expected result: 1 (Hy cọng 0! = 1)
    // * Actual Result: ??? chờ hàm mới biết
    // * Status: passed/failes
    @Test   //Framework ép ta phải viết code theo 1 quy tắc nào đó
            //Library cho viết tự do, gọi hàm tự do
    //Framework là thư viện, nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg0ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //Test Case #2: Check/Test getF() ưith n = 1
    // * Input/Given n = 1
    // * Steps/Procedure (bước test)
    //call method getFactorial(n)
    // * Expected result: 1 (Hy cọng 1! = 1)
    // * Actual Result: ??? chờ hàm mới biết
    // * Status: passed/failes
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test Case #3: Check/Test getF() with n = 5, expected = 120
    @Test
    public void testFactorialGivenRightArg5ReturnsWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //Test Case #4
    @Test
    public void testFactorialGivenRightArg12345ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //Thấy ngoại lệ mừng rơi nước mắt
    //Test Case #5: Check/Test getF() with n = -1, the method throws Exception
    @Test
    public void testFactorialGivenRightArg_1ThrowsException() {
//        assertThrows(NumberFormatException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
    
    
//    public MathUtilityTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
}
