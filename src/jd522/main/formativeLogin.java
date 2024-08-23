/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jd522.main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class formativeLogin {
   // Attributes
    public String firstName;
    public String lastName;
    private static ArrayList<User> registeredUsers = new ArrayList<>();

    public boolean correctUserName(String username) {
        if (username.contains("#") && username.length() <= 8) {
            JOptionPane.showMessageDialog(null, "Username Accepted, Proceed", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username does not meet the criteria, please ensure that your username contains a pound sign (#) and is no more than 8 characters in length.", "Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean meetPasswordComplexity(String password) {
        if (password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*(),.?\\\":{}|<>].*")) {
            JOptionPane.showMessageDialog(null, "Password Accepted", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Password not Accepted, please check that you have met all the criteria required", "Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean isNameFieldsEmpty(String firstName, String lastName) {
        if (firstName.equals("Enter First Name") || lastName.equals("Enter Last Name")) {
            JOptionPane.showMessageDialog(null, "Please fill in both your first name and last name.", "Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean regUser(String username, String password, String firstName, String lastName) {
        if (correctUserName(username) && meetPasswordComplexity(password) && isNameFieldsEmpty(firstName, lastName)) {
            registeredUsers.add(new User(username, password, firstName, lastName));
            JOptionPane.showMessageDialog(null, "Successfully registered", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed", "Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean login(String username, String password) {
        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                this.firstName = user.getFirstName();
                this.lastName = user.getLastName();
                return true;
            }
        }
        return false;
    }

    public String returnLogin(String username, String password) {
        if (login(username, password)) {
            return "Congratulations " + this.firstName + " " + this.lastName + ",\n"
                    + " You have made it to the second year.\n"
                    + "Wishing you all the best";
        } else {
            return "Incorrect credentials have been supplied, try again.";
        }
    } 
}
