/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


public class Admin {
    String usernameadmin,passwordadmin;

    public Admin(String usernameadmin, String passwordadmin) {
        this.usernameadmin = usernameadmin;
        this.passwordadmin = passwordadmin;
    }

    public String getUsernameadmin() {
        return usernameadmin;
    }

    public void setUsernameadmin(String usernameadmin) {
        this.usernameadmin = usernameadmin;
    }

    public String getPasswordadmin() {
        return passwordadmin;
    }

    public void setPasswordadmin(String passwordadmin) {
        this.passwordadmin = passwordadmin;
    }

}
