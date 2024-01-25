/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import entity.Admin;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import admin.admin;    
public class loginadmin extends JFrame{
   
    public static ArrayList<Admin>ad =new ArrayList<>();
    private String username_admin,password_admin;
    String usr,par,usl,pal;
    JLabel Userreg,Passreg,Userlog,Passlog;
    JButton Reg,Log;
    JTextField userreg,userlog, passreg ,passlog;
    
    public String getUsername_admin() {
        return username_admin;
    }

    public void setUsername_admin(String username_admin) {
        this.username_admin = username_admin;
    }

    public String getPassword_admin() {
        return password_admin;
    }

    public void setPassword_admin(String password_admin) {
        this.password_admin = password_admin;
    }
    
     public void regtampilan(){
        setTitle("Register Admin");
        setSize(600, 400);
        setLayout(null);
        regist();
        setVisible(true);
    }
    
     public void logtampilan(){
        setTitle("login Admin");
        setSize(600, 400);
        setLayout(null);
        Logad();
        setVisible(true);
    }
     
      public void regist(){
        Userreg=new JLabel("Username");
        Userreg.setBounds(30, 40, 300, 30);
        userreg=new JTextField();
        userreg.setBounds(30, 110, 300, 40);
        Passreg=new JLabel("Password");
        Passreg.setBounds(30, 180, 300, 30);
        passreg=new JTextField();
        passreg.setBounds(30, 260, 300, 40);
        Reg=new JButton("Register");
        Reg.setBounds(100, 320, 200, 40);
        add(Userreg);
        add(userreg);
        add(Passreg);
        add(passreg);
        add(Reg);
        eventregister();
    }
      
      public void Logad(){
        Userlog=new JLabel("Login Username");
        Userlog.setBounds(400, 40, 300, 30);
        userlog=new JTextField();
        userlog.setBounds(400, 110, 300, 40);
        Passlog=new JLabel("Login Password");
        Passlog.setBounds(400, 180, 300, 30);
        passlog=new JTextField();
        passlog.setBounds(400, 260, 300, 40);
        Log=new JButton("Login");
        Log.setBounds(400, 320, 200, 40);
        
        add(Userlog);
        add(userlog);
        add(Passlog);
        add(passlog);
        add(Log);
        eventlogin();
    }
    
      
    void eventregister(){
     Reg.addActionListener((event->{
         loginadmin la=new loginadmin();
     usr=userreg.getText();
     par=passreg.getText();
     la.setUsername_admin(usr);
     la.setPassword_admin(par);
     ad.add(new Admin(la.getUsername_admin(),la.getPassword_admin()));
     }));
       
    }
    
    void eventlogin(){
        admin a=new admin();
        Log.addActionListener((event->{
         loginadmin la=new loginadmin();
     usl=userlog.getText();
     pal=passlog.getText();
     if(usl.equals(usr)&& pal.equals(par)){
         a.frameadmin();
     }
     else{
          System.out.println(" belum masuk kang atuh");
     }
     }));
    }
    
}
