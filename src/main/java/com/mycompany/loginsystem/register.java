/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class register {
 //declaration
    String username="Ava_1";
    String password="Pheello5_";
    String firstname="Pheello";
    String lastname="Motaung";
    String providedusername;
    String providedpassword;
    
    Scanner scanner = new Scanner(System.in);

       public boolean Checkusername(String username){
   // varifying username
   if(providedusername.contains("_") && providedusername.length() >=2 && providedusername.length() <=5){
       System.out.println("Username secured");
       return true;
      }
   else{
       System.out.println("Unable to secure username please try again");
       return false;
      
   }
}
         public boolean CheckpasswordCompexity(String password){
      // varifying  password
      if(providedpassword.contains("?=[A-Z]") && providedpassword.contains("?=[!@#$%^&*()_+]") && providedpassword.length() <=8 && providedpassword.contains("?=[1-9]")){
          System.out.println("Password successfully secured");
          return true;
          
      }
      else{
          System.out.println("Unable to secure password please try again");
          return false;
      }
    }
}
    