/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package film;
import login.loginuser;
import javax.swing.*;
import entity.film;
public class belitiket extends JFrame{
  
    loginuser lu= new loginuser();
    String carii;
    JLabel nama;
    JTextField pilih;
    JButton buy;
    Film fm=new Film();
    public void belitiket(){
        setTitle("BELI TIKET FILM");
        setSize(600, 400);
        setLayout(null);
        buy();
        setVisible(true);
    }
   
   void buy(){
        nama= new JLabel("Cari Film");
        nama.setBounds(30, 50, 300, 50);
        
        pilih=new JTextField();
        pilih.setBounds(30, 110, 300, 50);
        
        buy= new JButton("Cari");
        buy.setBounds(30, 170, 300, 50);
        add(nama);
        add(buy);
        add(pilih);
        eventbuy();
   }
   
   void eventbuy(){
       buy.addActionListener((event->{
       carii=pilih.getText();
       for(film bu: fm.f){
           if(bu.tayang().equals("Tayang")){
               if(bu.judul().equals(carii)){
                System.out.println("============================================");
                System.out.println("Nama Pembeli: "+lu.getUsername_pengunjung());
                System.out.println("Judul film: "+bu.judul());
                System.out.println("Jam tayang: "+bu.jamtayang());
                System.out.println("Studio: "+bu.studio());
                System.out.println("Harga: "+bu.harga());
           }
           }
          
       }
       
       }));
   }
   
}


