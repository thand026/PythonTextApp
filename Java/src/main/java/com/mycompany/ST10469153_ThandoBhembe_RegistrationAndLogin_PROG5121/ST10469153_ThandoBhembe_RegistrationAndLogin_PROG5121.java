/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121;

/**
 *
 * @author Thando Bhembe
 */
import java.util.Scanner;
import java.util.regex.*;

public class ST10469153_ThandoBhembe_RegistrationAndLogin_PROG5121 {

    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        
        String regUsername = null;
        String regPassword = null;
        
        
        // Start of the WHOLE PROGRAM
        
        System.out.println("==      Welcome new User!       ==");
        
        System.out.println("Please enter your name");
            String name = inputObject.nextLine();
        System.out.println("Please enter your surname");
            String surname = inputObject.nextLine();

        
        System.out.println("Please register your username (Username must conatin an underscore and must be no more than 5 characters)");
        
        
        // username registration validation


        boolean isUsernmeValid = false;
        
        //  Start with the loop first
        while(!isUsernmeValid){
            regUsername = inputObject.nextLine();
            isUsernmeValid = checkUserName(regUsername);
            
            if(isUsernmeValid){
                System.out.println("Username Successfully captured.");
            }
            else{
                System.out.println("Username is not correctly formatted, Please ensure that your username contains an undercore and is no more than five characters in length.");
            }
        }
        
        System.out.println("=   Please register your password   =");
        
        // End of username validation
        
        // Password Validation:
        
        boolean isPasswordValid = false;
        
        while(!isPasswordValid){
            regPassword = inputObject.nextLine();
            isPasswordValid = checkPasswordComplexity(regPassword);
            
            if(isPasswordValid){
                System.out.println("Password successfully captured.");
            }
            else{
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight charcters, a capital letter, a number, and a special character.");
                System.out.println("Try again");
            }
        }
//        
//        // End of password Validation
        
        System.out.println("Please Register a Cellphone Number (start with international code +27 followed by 9 digits)");
        
        //Cellphone number registration:
         
        boolean isCellphoneValid = false;
        
        while (!isCellphoneValid) {            
            String regCellphoneNr = inputObject.nextLine();
            isCellphoneValid = checkCellPhoneNumber(regCellphoneNr);
            
            if(isCellphoneValid){
                System.out.println("Cell phone number successfully added");
            }
            
            else{
                System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            }
        }
        
        // END OF CELLPHONE NUMBER REGISTRATION
        
        System.out.println(" ");
        
        // LOGIN!!!
        
        System.out.println("==  Welcome to the login page!   ==");
        
        
        boolean loginUser = false;
        while(!loginUser){
            System.out.println("Please enter your username");
                String loginUsername = inputObject.nextLine();
            
            System.out.println("Please enter your password");
                String loginPassword = inputObject.nextLine();
            
            if(loginUsername.equals(regUsername) && loginPassword.equals(regPassword)){
                System.out.println("Welcome " + name + " " + surname + ". It is great to see you again!");
                loginUser = true;
            }
            else{
                System.out.println("Username or password incorrect, please try again");
            }
                

        }
        
        
        
    }
    
    // Methods!
    
    public static boolean checkUserName(String input){
        return input.length()<=5 && input.contains("_");    // username must be no more than 5 characters and must contain an underscore
        
    }
    
    public static boolean checkPasswordComplexity(String input2){
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";
        return input2.matches(regex);
   }
    
    //Regex generated with Deepseek Chat (Deepseek, 2025)
    public static boolean checkCellPhoneNumber(String input3String){
        String regex = "^\\+27[0-9]{9}$";
        return input3String.matches(regex);
    }
}
