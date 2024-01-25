/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

import javax.swing.*;
import java.awt.*;
import film.Film;
import java.awt.event.ActionEvent;
import film.carifilm;
public class admin extends JFrame{
    
    JButton add,tayangfilm,delete,read;
  public void frameadmin(){
        setTitle("Admin");
        setSize(600,400);
        setLayout(null);
        button();
        setVisible(true);
  }
  
  public void button(){
        add=new JButton("Tambah film");
        add.setBounds(75, 50, 200, 50);
        read=new JButton("Lihat daftar film");
        read.setBounds(75, 110, 200, 50);
        tayangfilm=new JButton("Lihat film tayang");
        tayangfilm.setBounds(75, 170, 200, 50);
        delete=new JButton("delete film");
        delete.setBounds(75, 220, 200, 50);
       
        events();
        add(add);
        add(read);
        add(tayangfilm);
        add(delete);
        
    }
    
 public void events(){
     
        Film f=new Film();
        carifilm cf=new carifilm();
        add.addActionListener((event->{
           f.Tambah();
        }));
        
        read.addActionListener(((ActionEvent event)->{ 
         f.lihatall();
        }));
        tayangfilm.addActionListener((event->{
         System.out.println(f.tayangfilm());
        }));
        
        delete.addActionListener((event->{
          System.out.println("Delete");
        }));
        
        
 }
}
