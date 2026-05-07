/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dr Gugulethu
 */
public class ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121Test {
    
    public ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121Test() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testCheckUserName_Valid() {
        assertTrue(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkUserName("kyl_1"));
    }
    @Test
    public void testCheckUserName_Invalid(){
        assertFalse(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkUserName("kyle!!!!!!!"));
        
    }
    

    @Test
    public void testCheckPasswordComplexity_Valid() {
        assertTrue(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckPasswordComplexity_Invalid() {
        assertFalse(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkPasswordComplexity("password"));
    }
    
    @Test
    public void testCheckCellPhoneNumber_Valid(){
        assertTrue(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testCheckCellPhoneNumber_Invalid(){
        assertFalse(ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121.checkCellPhoneNumber("08966553"));
    }
    
}
