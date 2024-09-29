/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class LoginSystem {

    public static void main(String[] args) {
        //Declarations 
        String firstname,lastname,username;
        String password;
        
        Scanner scanner = new Scanner(System.in);
         
       //Register user details 
       System.out.println("Please enter firstname");
       firstname = scanner.nextLine();
       
        System.out.println("Please enter lastname");
        lastname = scanner.nextLine();
        
        System.out.println("Please create username");
        username = scanner.nextLine();
         
        System.out.println("Please create password");
        password = scanner.nextLine();
        
        //login user details 
        System.out.println("Please enter username");
        username = scanner.nextLine();
         
        System.out.println("Please enter password");
        password = scanner.nextLine();
        
        
    }
}
