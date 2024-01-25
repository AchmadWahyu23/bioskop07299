/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengunjung;

import film.Film;
import film.carifilm;
import java.awt.event.ActionEvent;
import javax.swing.*;
import film.belitiket;

/**
 *
 * @author ASUS
 */
public class pengunjung extends JFrame{
 
     JButton cari,beli,read;
    public void tampilanpengunjung(){
        setTitle("Pengunjung");
        setSize(600,400);
        setLayout(null);
        button();
        setVisible(true);
    }
    public void button(){
        cari=new JButton("Cari film");
        cari.setBounds(75, 50, 200, 50);
        read=new JButton("Lihat daftar film yang tayang");
        read.setBounds(75, 110, 200, 50);
        beli=new JButton("Beli film");
        beli.setBounds(75, 170, 200, 50);
        events();
        add(cari);
        add(read);
        add(beli);
    }
     public void events(){
        Film f=new Film();
        carifilm cf=new carifilm();
        cari.addActionListener((event->{
          cf.cari();
        }));
        
        read.addActionListener(((ActionEvent event)->{ 
         System.out.println(f.tayangfilm());
        }));
        beli.addActionListener((event->{
        belitiket b=new belitiket();
        b.belitiket();
        }));
        
 }
}
