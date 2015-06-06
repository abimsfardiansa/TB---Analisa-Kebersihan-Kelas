
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
abstract public class kemananan_kelas{
    
    /*private String kokoh;
    private String kpintu;
    private String kjendela;
    private String bahaya;*/
    
    String kokoh;
    String kpintu;
    String kjendela;
    String bahaya;
    
    Scanner k=new Scanner(System.in);

    public kemananan_kelas(String kokoh, String kpintu, String kjendela, String bahaya) {
        this.kokoh = kokoh;
        this.kpintu = kpintu;
        this.kjendela = kjendela;
        this.bahaya = bahaya;
    }

    public void amana(){
        System.out.println("Analisis Keamanan");
      System.out.print("Kekokohan kelas = ");
      kokoh=k.next();
      System.out.print("Kunci pintu = ");
      kpintu=k.next();
      System.out.print("Kunci jendela = ");
      kjendela=k.next();
      System.out.print("Keamanan kelas = ");
      bahaya=k.next();
    }
    
    public abstract void aman();
}
