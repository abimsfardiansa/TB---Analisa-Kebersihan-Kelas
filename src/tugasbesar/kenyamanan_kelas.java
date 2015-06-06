
import java.util.Scanner;


//import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public abstract class kenyamanan_kelas {
 
    
    /*private String bising;
    private String bau;
    private String bocor;
    private String rusak;
    private String aus;*/
    
    String bising;
    String bau;
    String bocor;
    String rusak;
    String aus;
    
    
    
    public kenyamanan_kelas(String bising, String bau, String bocor, String rusak, String aus) {
        this.bising = bising;
        this.bau = bau;
        this.bocor = bocor;
        this.rusak = rusak;
        this.aus = aus;
    }
    Scanner z=new Scanner(System.in);
    public void saya(){
        System.out.println("Analisis Kenyamanan Kelas");
        System.out.print("Kebisingan  = ");
       // setBising(a.nextLine());
        bising=z.next();
        System.out.print("Bau ruangan = ");
        //setBau(a.nextLine());
        bau=z.next();
        System.out.print("Kebocoran = ");
        //setBocor(a.nextLine());
        bocor=z.next();
        System.out.print("Kerusakan = ");
        //setRusak(a.nextLine());
        rusak=z.next();
        System.out.print("Keausan   = ");
        //setAus(a.nextLine());
        aus=z.next();
    }
    
   public abstract void masuk();
}
