/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import entity.User;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import pengunjung.pengunjung;

public class loginuser extends JFrame{
    public static ArrayList<User>pengunjung=new ArrayList<>();
    public String username_pengunjung,password_pengunjung;
    public static String usrp,parp,uslp,palp;
    JLabel Userreg,Passreg,Userlog,Passlog;
    JButton Reg,Log;
    JTextField userreg,userlog, passreg ,passlog;

    public String getUsername_pengunjung() {
        return username_pengunjung;
    }

    public void setUsername_pengunjung(String username_pengunjung) {
        this.username_pengunjung = username_pengunjung;
    }

    public String getPassword_pengunjung() {
        return password_pengunjung;
    }

    public void setPassword_pengunjung(String password_pengunjung) {
        this.password_pengunjung = password_pengunjung;
    }

     public void regtampilan(){
        setTitle("Register pengunjung");
        setSize(600, 400);
        setLayout(null);
        registpengunjung();
        setVisible(true);
    }
     
      public void logpengunjung(){
        setTitle("login Pengunjung");
        setSize(600, 400);
        setLayout(null);
        Logpeng();
        setVisible(true);
    }
    
      public void registpengunjung(){
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
      
       public void Logpeng(){
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
        loginuser lu=new loginuser();
     usrp=userreg.getText();
     parp=passreg.getText();
     lu.setUsername_pengunjung(usrp);
     lu.setPassword_pengunjung(parp);
     pengunjung.add(new User(lu.getUsername_pengunjung(),lu.getPassword_pengunjung()));
     }));
       
    }
       void eventlogin(){
        Log.addActionListener((event->{
         pengunjung p=new pengunjung();
     uslp=userlog.getText();
     palp=passlog.getText();
     if(uslp.equals(usrp)|| palp.equals(parp)){
         p.tampilanpengunjung();
     }
     else{
          System.out.println(" belum masuk password atau username salah");
     }
     }));
    }
    
}

