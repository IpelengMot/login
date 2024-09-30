/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class RegisterTest{
    private register reg;
    
    @Test
    public void testCheckUsername_Valid() {
        String input = "Ava_1";
        reg.providedusername = input; // Directly setting the provided username
        assertTrue(reg.Checkusername(input));
    }

    @Test
    public void testCheckUsername_Invalid() {
        String input = "A"; // Invalid username
        reg.providedusername = input;
        assertFalse(reg.Checkusername(input));
    }

    @Test
    public void testCheckPasswordComplexity_Valid() {
        String input = "Pheello5_"; // Assuming this is valid
        reg.providedpassword = input; 
        assertTrue(reg.CheckpasswordCompexity(input));
    }

    @Test
    public void testCheckPasswordComplexity_Invalid() {
        String input = "weakpass"; // Invalid password
        reg.providedpassword = input;
        assertFalse(reg.CheckpasswordCompexity(input));
    }

    @Test
    public void testRegisterUser() {
        String input = "Pheello\nMotaung\nAva_1\nPheello5_\nAva_1\nPheello5_";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertNull(reg.registerUser("", "", "", ""));
    }

    @Test
    public void testLoginUser() {
        String input = "Ava_1\nPheello5_";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertFalse(reg.loginuser("", ""));
    }

    @Test
    public void testReturnLoginStatus() {
        String input = "Ava_1\nPheello5_";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertNull(reg.ReturnloginStatus("", ""));
    }
}




