/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioskop;


import javax.swing.*;
import java.awt.*;
import admin.logadmin;
import pengunjung.loguser;
public class halutama extends JFrame{
    JButton admin,user;
    
    public void frame(){
        setTitle("Bioskop:");
        setSize(600,400);
        setLayout(null);
        button();
        setVisible(true);
    }
    
    
    
    public void button(){
        admin=new JButton("Admin Login");
        admin.setBounds(75, 50, 200, 50);
        user=new JButton("Pengunjung Login");
        user.setBounds(75, 110, 200, 50);
        event();
        add(admin);
        add(user);
    }
    
    
    public void event(){
        admin.addActionListener((event->{
          logadmin la=new logadmin();
          la.frameAdmin();
        }));
        
        user.addActionListener((event-> {
          loguser lu=new loguser();
          lu.frameuser();
        }));
        
    }
}
