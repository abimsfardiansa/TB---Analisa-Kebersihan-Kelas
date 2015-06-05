
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XOC
 */
abstract public class kebersihan_Kelas {
    private String sirkulasi;
    private int cahaya;
    private int kelembaban;
    private int suhu;
    
    Scanner keb=new Scanner(System.in);

    public kebersihan_Kelas(String sirkulasi, int cahaya, int kelembaban, int suhu) {
        this.sirkulasi = sirkulasi;
        this.cahaya = cahaya;
        this.kelembaban = kelembaban;
        this.suhu = suhu;
    }

    
    public String getSirkulasi() {
        return sirkulasi;
    }

    public void setSirkulasi(String sirkulasi) {
        this.sirkulasi = sirkulasi;
    }

    public int getCahaya() {
        return cahaya;
    }

    public void setCahaya(int cahaya) {
        this.cahaya = cahaya;
    }

    public int getKelembaban() {
        return kelembaban;
    }

    public void setKelembaban(int kelembaban) {
        this.kelembaban = kelembaban;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
 
    public abstract void  mlebu();
    public abstract void  analisis();
    public abstract void output();
}
