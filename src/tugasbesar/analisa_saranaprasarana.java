
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisa_saranaprasarana extends saranPrasarana{
    Scanner sa=new Scanner(System.in);
    public Analisa_saranaprasarana(int jumlah1, String kondisi1, String posisi1, int jumlah2, String kondisi2, String posisi2, int jumlah3, String kondisi3, String posisi3, int jumlah4, String kondisi4, String posisi4, int jumlah5, String kondisi5, String posisi5, int jumlah6, String kondisi6, String posisi6, String ssid, int bandwidth, String login) {
        super(jumlah1,kondisi1,  posisi1, jumlah2, kondisi2,posisi2,jumlah3, kondisi3,posisi3,jumlah4,kondisi4,posisi4,jumlah5,kondisi5,posisi5,jumlah6,kondisi6,posisi6,ssid, bandwidth,login);
        System.out.println("\nAnalisa Sarana Prasarana");
        input();
    }
    
   
}
