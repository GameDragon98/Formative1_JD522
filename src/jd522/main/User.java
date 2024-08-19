/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jd522.main;

/**
 *
 * @author user
 */
public class User {

    // Attributes
    private String _username;
    private String _password;
    private String _firstName;
    private String _lastName;

    public User(String username, String password, String firstName, String lastName) {
        this._username = username;
        this._password = password;
        this._firstName = firstName;
        this._lastName = lastName;
    }

    public String getUsername() {
        return _username;
    }

    public String getPassword() {
        return _password;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }
}
