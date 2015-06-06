
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Identitas_kelas {
    
    private String namaruang;
    private String lokasi;
    private String jurusan;
    private String fakultas;

    public Identitas_kelas(String namaruang, String lokasi, String jurusan, String fakultas) {
        this.namaruang = namaruang;
        this.lokasi = lokasi;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }
    
   
    
    public String getNamaruang() {
        return namaruang;
    }

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
      
    Scanner a=new Scanner(System.in);
    void identitas(){
        try {
        System.out.println("\n\t\tINVENTARIS KELAS");
        System.out.print("\nNama ruang   = ");
        setNamaruang(a.next());
        System.out.print("Lokasi ruang = ");
        setLokasi(a.next());
        System.out.print("Jurusan      = ");
        setJurusan(a.next());
        System.out.print("Fakultas     = ");
        setFakultas(a.next());
        System.out.println("------------------------------------------------");
        System.out.println(getFakultas()+" "+getJurusan()+"\t"+getLokasi()+" "+getNamaruang());
        
        
        String path = "D:/identitas.txt";
            boolean append = true;//jika append = false file lama dihapus, jika true melanjutkan file yang ada
 
            TextHandle file = new TextHandle(path,append);  file.writeFile(getNamaruang());
            file.writeFile(getLokasi());
            file.writeFile(getJurusan());
            file.writeFile(getFakultas());
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
}
