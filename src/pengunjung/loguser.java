/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengunjung;

import javax.swing.*;
import java.awt.*;
import login.loginuser;


public class loguser extends JFrame{
    JButton registeruser,loginuser;
    
    public void frameuser(){
        setTitle("User:");
        setSize(600,400);
        setLayout(null);
        buttonuser();
        setVisible(true);
    }
    
    public void buttonuser(){
        registeruser=new JButton("Pengunjung register");
        registeruser.setBounds(75, 50, 200, 50);
        registeruser.setBackground(Color.BLUE);
        registeruser.setForeground(Color.WHITE);
        loginuser=new JButton("Pengunjung Login");
        loginuser.setBounds(75, 110, 200, 50);
        loginuser.setBackground(Color.BLUE);
        loginuser.setForeground(Color.WHITE);
        event();
        add(registeruser);
        add(loginuser);
    }
    
    public void event(){
        loginuser lu=new loginuser();
        registeruser.addActionListener((event->{
          lu.regtampilan();
        }));
        
        loginuser.addActionListener((event->{
           lu.logpengunjung();
        }));
    }
}
