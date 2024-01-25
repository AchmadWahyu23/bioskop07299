/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

abstract class afilm{
   public abstract String judul();
   public abstract String tayang();
   public abstract String studio();
   public abstract String jamtayang();
   public abstract String harga();
}
public class  film extends afilm{
   public String judul,tayang,studio,jamtayang,harga; 

    public film(String judul, String tayang, String studio,String jamtayang,String harga) {
        this.judul = judul;
        this.tayang = tayang;
        this.studio = studio;
        this.jamtayang=jamtayang;
        this.harga=harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTayang() {
        return tayang;
    }

    public void setTayang(String tayang) {
        this.tayang = tayang;
    }

    public String getStudio() {
        return studio;
    }

    public String getJamtayang() {
        return jamtayang;
    }

    public void setJamtayang(String jamtayang) {
        this.jamtayang = jamtayang;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String judul() {
        return getJudul();
    }

    @Override
    public String tayang() {
        return getTayang();
    }

    @Override
    public String studio() {
        return getStudio();
    }

    @Override
    public String harga() {
        return getHarga();
    }
    
   @Override
    public String jamtayang(){
        return getJamtayang();
    }
}