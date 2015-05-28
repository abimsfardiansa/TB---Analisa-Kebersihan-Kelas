/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Danang
 */
public class inp_R_kelas {
    String kebisingan;
    String bau;
    String kebocoran;
    String kerusakan;
    String keausan;
    
    Scanner rkls = new Scanner(System.in);
    
    public void inpt (String rkelas){
        System.out.println("Kebisingan Ruangan Bising/Tidak Bising  = ");
        kebisingan=rkls.next();
        System.out.println("Kondisi Bau Ruangan Bau/Tidak Bau       = ");
        bau=rkls.next();
        System.out.println("Kebocoran Ruangan Bocor/Tidak Bocor     = ");
        kebocoran=rkls.next();
        System.out.println("Kerusakan Ruangan Rusak/Tidak Rusak     = ");
        kerusakan=rkls.next();
        System.out.println("Keausan Ruangan Aus/Tidak               = ");
    }
    String bising (){
    return kebisingan;
}
    String ruang_kelas(){
        return null;
    }
}
