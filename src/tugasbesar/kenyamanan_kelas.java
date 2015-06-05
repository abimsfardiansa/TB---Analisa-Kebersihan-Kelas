
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
 
    
    private String bising;
    private String bau;
    private String bocor;
    private String rusak;
    private String aus;

    public kenyamanan_kelas(String bising, String bau, String bocor, String rusak, String aus) {
        this.bising = bising;
        this.bau = bau;
        this.bocor = bocor;
        this.rusak = rusak;
        this.aus = aus;
    }
    
    
    
    
    public String getBising() {
        return bising;
    }

    public void setBising(String bising) {
        this.bising = bising;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getBocor() {
        return bocor;
    }

    public void setBocor(String bocor) {
        this.bocor = bocor;
    }

    public String getRusak() {
        return rusak;
    }

    public void setRusak(String rusak) {
        this.rusak = rusak;
    }

    public String getAus() {
        return aus;
    }

    public void setAus(String aus) {
        this.aus = aus;
    }
    

    Scanner z=new Scanner(System.in);
    
    
    
   public abstract void masuk();
   public abstract void analisisnyaman();
   public abstract void njobo();
}
