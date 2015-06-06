
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public abstract class kondisi_Kelas {
    
   /* int panjang;
    int lebar;
    int luas;
    int kursi;
  //  int rasio;
    int pintu;
    int jendela;

    Scanner kond=new Scanner(System.in);

    public void masuk(String hai){
        System.out.print("Panjang ruang  = ");
        panjang=kond.nextInt();
        System.out.print("Lebar ruang    = ");
        lebar=kond.nextInt();
        System.out.print("Jumlah kursi   = ");
        kursi=kond.nextInt();
        System.out.print("Jumlah pintu   = ");
        pintu=kond.nextInt();
        System.out.print("Jumlah jendela = ");
        jendela=kond.nextInt();
    }
    int Luas(){
        return panjang;
    }*/
    
    
   private int panjang;
   private int lebar;
   private int luas;
   private int kursi;
   private int pintu;
   private int jendela;

   
   
    public kondisi_Kelas(int panjang, int lebar, int luas, int kursi, int pintu, int jendela) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = luas;
        this.kursi = kursi;
        this.pintu = pintu;
        this.jendela = jendela;
    }

   
   
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public int getJendela() {
        return jendela;
    }

    public void setJendela(int jendela) {
        this.jendela = jendela;
    }
   
   Scanner kond=new Scanner(System.in);

    public void masuk(){
        System.out.print("Panjang ruang  = ");
        setPanjang(kond.nextInt());
        System.out.print("Lebar ruang    = ");
        setLebar(kond.nextInt());
        System.out.print("Jumlah kursi   = ");
        setKursi(kond.nextInt());
        System.out.print("Jumlah pintu   = ");
        setPintu(kond.nextInt());
        System.out.print("Jumlah jendela = ");
        setJendela(kond.nextInt());
    }
    
    public abstract int Luas();
    public abstract float rasioluas();
    public abstract int jmlpintu();
    public abstract int jmljendela();
    
}
