/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**sdf
 *
 * @author AHO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Identitas_kelas id=new Identitas_kelas(null, null, null, null);
      //  id.identitas();
        
       /* analisis_kondisi1 kond=new analisis_kondisi1(100, 900, 100, 200, 10, 20);
        kond.Luas();
        kond.rasioluas();
        kond.jmlpintu();
        kond.jmljendela();
        
        Analisa_saranaprasarana a=new Analisa_saranaprasarana(1, null, null, 2, null, null, 3, null, null, 4, null, null, 5, null, null, 6, null, null, null, 7, null);
        a.AnalisaJumlahSteker();
        a.AnalisaKondisiSteker();
        a.AnalisaPosisiSteker();
        
        a.AnalisaJumlahLcd();
        a.AnalisaKondisiLcd();
        a.AnalisaPosisiLcd();
        
        a.AnalisaJumlahLampu();
        a.AnalisaKondisiLampu();
        a.AnalisaPosisiLampu();
        
        a.AnalisaJumlahKipas();
        a.AnalisaKondisiKipas();
        a.AnalisaPosisiKipas();
        
        a.AnalisaJumlahac();
        a.AnalisaKondisiac();
        a.AnalisaPosisiac();
        
        a.pilihssid();
        a.AnalisaLogin();
        
        a.AnalisaJumlahcctv();
        a.AnalisaKondisicctv();
        a.AnalisaPosisicctv1();
        a.AnalisaPosisicctv2();*/
        
        analisis_lingkungan lk=new analisis_lingkungan(null,null,null,null,null);
        //lk.inputling();
        
       analisis_kebersihan ber=new analisis_kebersihan(null,12,11,1);
        ber.mlebu();
        
        
       analisis_kenyamanan ny=new analisis_kenyamanan(null, null, null, null, null);
       ny.masuk();

        analisis_keamanan qw=new analisis_keamanan(null, null, null, null);
        qw.aman();
    }
}
