/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package film;
import javax.swing.*;
import entity.film;
public class carifilm extends JFrame{
    String carii;
    JLabel nama;
    JTextField search;
    JButton S;
    Film fm=new Film();
    public void cari(){
         
        setTitle("Cari FILM");
        setSize(600, 400);
        setLayout(null);
        search();
        setVisible(true);
    }
   
   void search(){
        nama= new JLabel("Cari Film");
        nama.setBounds(30, 50, 300, 50);
        
        search=new JTextField();
        search.setBounds(30, 110, 300, 50);
        S= new JButton("Cari");
        S.setBounds(30, 170, 300, 50);
        add(nama);
        add(search);
        add(S);
        eventsearch();
   }
   
   void eventsearch(){
       S.addActionListener((event->{
       carii=search.getText();
       System.out.println("Judul  | Status  | Studio    | Jam   |   Harga");
       for(film ca: fm.f){
           if(ca.tayang().equals("Tayang")){
             if(ca.judul().equals(carii)){
                System.out.println(ca.judul()+" "+ca.tayang()+" "+ca.studio()+" "+ca.jamtayang()+" "+ca.harga());
           }  
           }
           
       }
       
       }));
   }
   
}
