/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class User {
     private String usernameuser,passworduser;

    public User(String usernameuser, String passworduser) {
        this.usernameuser = usernameuser;
        this.passworduser = passworduser;
    }

    public String getUsernameuser() {
        return usernameuser;
    }

    public void setUsernameuser(String usernameuser) {
        this.usernameuser = usernameuser;
    }

    public String getPassworduser() {
        return passworduser;
    }

    public void setPassworduser(String passworduser) {
        this.passworduser = passworduser;
    }

}
