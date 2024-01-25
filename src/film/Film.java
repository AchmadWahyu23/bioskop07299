/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package film;
import java.util.ArrayList;
import entity.film;
import javax.swing.*;

public class Film extends JFrame{
   
    public static ArrayList<film>f=new ArrayList<>();
    String judul,tayang,studio,harga,jamtayang;
    String j,t,s,h, jamtay;
    JLabel J,T,S,H,JT;
    JTextField nama,Studio,price,jamta;
    JComboBox status;
    JButton Add;
    film fm=new film(judul,tayang,studio,jamtayang,harga);
    public void Tambah(){
        
        setTitle("ADD FILM");
        setSize(600, 400);
        setLayout(null);
        adds();
        setVisible(true);
    }
    
    void adds(){
        J= new JLabel("judul");
        J.setBounds(30, 50, 300, 50);
        
        nama=new JTextField();
        nama.setBounds(30, 110, 300, 50);
        T= new JLabel("Waktu");
        T.setBounds(30, 170, 300, 50);
        
        String tays[]={
            "Tayang", "Belum Tayang"
        };
        status=new JComboBox(tays);
        status.setBounds(30, 240, 250, 50);
        H=new JLabel("Harga");
        H.setBounds(30, 310, 300, 50);
        price=new JTextField();
        price.setBounds(30, 380, 300, 50);
        
        S=new JLabel("Studio");
        S.setBounds(30, 450, 300, 50);
        Studio=new JTextField();
        Studio.setBounds(30, 520, 300, 50);
        JT=new JLabel("Jam Tayang");
        JT.setBounds(350, 10, 200, 50);
        jamta=new JTextField();
        jamta.setBounds(350,70 , 200, 50);
        Add=new JButton("Tambah");
        Add.setBounds(210, 590, 100, 50);
        
        
        add(J);
        add(nama);
        add(T);
        add(status);
        add(H);
        add(price);
        add(S);
        add(Studio);
        add(Add);
        add(JT);
        add(jamta);
        eventadd();
    }
    
    void eventadd(){
        Add.addActionListener((event->{
        j=nama.getText();
        t=(String) status.getSelectedItem();
        s=Studio.getText();
        jamtay=jamta.getText();
        h=price.getText();
        
        fm.setJudul(j);
        fm.setTayang(t);
        fm.setStudio(s);
        fm.setJamtayang(jamtay);
        fm.setHarga(h);
        
        
        f.add(new film(fm.judul(),fm.tayang(),fm.studio(),fm.getJamtayang(),fm.harga()));
        }));
       
        
    }
    
   
    
   public static void lihatall(){
       System.out.println("Judul  | Status  | Studio    | Jam   |   Harga");
        for(film fi: f){
           
               System.out.println(fi.judul()+" |"+fi.tayang()+"| "+fi.studio()+"| "+fi.jamtayang()+" |"+fi.harga()); 
            
         
        }
        
   
   }  
    public static film tayangfilm(){
        System.out.println("Judul  | Status  | Studio    | Jam   |   Harga");
        for(film fi:f){
            if(fi.tayang().equals("Tayang")){
               System.out.println(fi.getJudul()+"| "+fi.getTayang()+"| "+fi.getStudio()+"| "+fi.getJamtayang()+"| "+fi.getHarga()); 
            }
         
        }
        return null;
    }
}