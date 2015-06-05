
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XOC
 */

public class analisis_kebersihan extends kebersihan_Kelas{
    Scanner er=new Scanner(System.in);
    public analisis_kebersihan(String sirkulasi, int cahaya, int kelembaban, int suhu){
        super(sirkulasi, cahaya, kelembaban, suhu);
    }
    @Override
    public void mlebu(){
        System.out.print("Keadaan sirkulasi udara = ");
        setSirkulasi(keb.next());
        System.out.print("Nilai pencahayaan       = ");
        setCahaya(keb.nextInt());
        System.out.print("Prosentase kelembaban   = ");
        setKelembaban(keb.nextInt());
        System.out.print("Suhu (celcius)          = ");
        setSuhu(keb.nextInt());
    }
    
    @Override
    public void analisis(){
       
        if(getSirkulasi().equals("lancar")){
            System.out.println("\tSirkulasi udara sesuai.");
        }
        else{
            System.out.println("\tSirkulasi udara tidak sesuai.");
        }
        
        
        if(getCahaya()>=250 &&getCahaya()<=350){
            System.out.println("\tNilai pencahayaan "+getCahaya()+", sesuai.");
        }
        else{
            System.out.println("\tNilai pencahayaan "+getCahaya()+", tidak sesuai.");
        }
        
        
        if(getKelembaban()>=70 &&getKelembaban()<=80){
            System.out.println("\tKelembaban ruang "+getKelembaban()+"%, sesuai.");
        }
        else{
            System.out.println("\tKelembaban ruang "+getKelembaban()+"%, tidak sesuai.");
        }
        
        
        if(getSuhu()>=25 &&getSuhu()<=35){
            System.out.println("\tSuhu "+getSuhu()+" drajat celcius, sesuai.");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tSuhu "+getSuhu()+" drajat celcius, tidak sesuai.");
            System.out.println("------------------------------------------------");
        }
    }
    @Override
    public void output(){
        System.out.println("sirkulasi udara = "+getSirkulasi());
        System.out.println("nilai pencahayaan = "+getCahaya());
        System.out.println("prosentase kelembaban = "+getKelembaban());
        System.out.println("suhu = "+getSuhu());
    }
  
}
