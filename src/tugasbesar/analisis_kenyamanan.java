
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XOC
 */
public class analisis_kenyamanan extends kenyamanan_kelas{
        Scanner a=new Scanner(System.in);
    public analisis_kenyamanan(String bising, String bau, String bocor, String rusak, String aus){
        super(bising,bau,bocor,rusak,aus);
    }
    

    @Override
    public void masuk(){
        System.out.println("Analisis Kenyamanan Kelas");
        System.out.print("Kebisingan  = ");
        setBising(a.next());
        System.out.print("Bau ruangan = ");
        setBau(a.next());
        System.out.print("Kebocoran = ");
        setBocor(a.next());
        System.out.print("Kerusakan = ");
        setRusak(a.next());
        System.out.print("Keausan   = ");
        setAus(a.next());
    }
    
    
    @Override
    public void analisisnyaman(){
        if(getBising().equals("tidak.bising")){
            System.out.println("\tHening, sesuai.");
        }
        else{
            System.out.println("\tBising, tidak sesuai.");
        }
        
         if(getBau().equals("tidak.bau")){
            System.out.println("\tHarum, sesuai.");
        }
        else{
            System.out.println("\tBau, tidak sesuai.");
        }
         
        if(getBocor().equals("tidak.bocor")){
            System.out.println("\tTidak bocor, sesuai.");
        }
        else{
            System.out.println("\tBocor, tidak sesuai.");
        }
        
        if(getRusak().equals("tidak.rusak")){
            System.out.println("\tUtuh, sesuai.");
        }
        else{
            System.out.println("\tRusak, tidak sesuai.");
        }
        
        if(getAus().equals("tidak.aus")){
            System.out.println("\tUtuh, sesuai.");
            
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tAus, tidak sesuai.");
            
            System.out.println("------------------------------------------------");
        }
    }
       
        @Override
        public void njobo(){
            System.out.println("Kebisingan = "+getBising());
            System.out.println("Bau ruangan = "+getBau());
            System.out.println("Kebocoran = "+getBocor());
            System.out.println("Kerusakan = "+getRusak());
            System.out.println("Keausan = "+getAus());
        }
}

