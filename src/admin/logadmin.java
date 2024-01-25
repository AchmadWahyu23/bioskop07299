/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import javax.swing.*;
import java.awt.*;
import login.loginadmin;
public class logadmin extends JFrame{
    JButton register,login;
    
    public void frameAdmin(){
        setTitle("Admin:");
        setSize(600,400);
        setLayout(null);
        buttonadmin();
        setVisible(true);
    }
    
    public void buttonadmin(){
        
        register=new JButton("Admin register");
        register.setBounds(75, 50, 200, 50);
        register.setBackground(Color.BLUE);
        register.setForeground(Color.WHITE);
        login=new JButton("admin Login");
        login.setBounds(75, 110, 200, 50);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        event();
        add(register);
        add(login);
    }
    
    public void event(){
        admin a=new admin();
        loginadmin lg=new loginadmin();
        register.addActionListener((event->{
           lg.regtampilan();
          
        }));
        
        login.addActionListener((event->{
           lg.logtampilan();
        }));
    }
}
