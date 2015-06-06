
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public abstract class saranPrasarana {
   /* Scanner sarana = new Scanner(System.in);
	int jumlah;
	String kondisi;
	String posisi;
        String posisi2;
        String ssid;
        int bandwidth;
        String login;
	
	public void input(String masuk){
		System.out.print("Jumlah  = ");
		jumlah = sarana.nextInt();
		System.out.print("Kondisi = ");
		kondisi = sarana.next();
	//	System.out.print("Posisi  = ");
	//	posisi = sarana.next();
	}
        public void inputsteker(){
            System.out.print("Posisi (dekat_dosen/tidak) = ");
            posisi=sarana.next();
        }
        public void inputlcd(){
            System.out.print("Posisi (dekat_dosen/tidak) = ");
            posisi=sarana.next();
        }
        public void inputlampu(){
            System.out.print("Posisi (atap_ruangan/dimana?) = ");
            posisi=sarana.next();
        }
        public void inputkipas(){
            System.out.print("Posisi (atap_ruangan/tidak) = ");
            posisi=sarana.next();
        }
        public void inputac(){
            System.out.print("Posisi (dibelakang/disamping) = ");
            posisi=sarana.next();
        }
        public void inputcctv(){
            System.out.print("Posisi cctv 1 (depan/belakang) = ");
            posisi=sarana.next();
            System.out.print("Posisi cctv 2 (depan/belakang) = ");
            posisi2=sarana.next();
        }
        
        
        public void internet(){
            System.out.print("SSID yang dipakai = ");
            ssid=sarana.next();
            System.out.print("Bandwidth (/KBps) = ");
            bandwidth=sarana.nextInt();
            System.out.println("Bisa login hotspot?");
            System.out.print("Jawab : ");
            login=sarana.next();
        }
           
           
           int AnalisaJumlahSteker(){
                return jumlah;
           }
           int AnalisaJumlahLcd(){
                return jumlah;
           }
           int AnalisaJumlahLampu(){
                return jumlah;
           }
           int AnalisaJumlahKipas(){
                return jumlah;
           }
          int AnalisaJumlahac(){
                return jumlah;
           }
           String pilihssid(){
               return ssid;
           }
           int AnalisaJumlahcctv(){
                return jumlah;
           }*/
    
    
    
        private int jumlah1;
	private String kondisi1;
	private String posisi1;
        private int jumlah2;
	private String kondisi2;
	private String posisi2;
        private int jumlah3;
	private String kondisi3;
	private String posisi3;
        private int jumlah4;
	private String kondisi4;
	private String posisi4;
        private int jumlah5;
	private String kondisi5;
	private String posisi5;
        private int jumlah6;
	private String kondisi6;
	private String posisi6;
        private String posisi6a;
        private String ssid;
        private int bandwidth;
        private String login;

    public saranPrasarana(int jumlah1, String kondisi1, String posisi1, int jumlah2, String kondisi2, String posisi2, int jumlah3, String kondisi3, String posisi3, int jumlah4, String kondisi4, String posisi4, int jumlah5, String kondisi5, String posisi5, int jumlah6, String kondisi6, String posisi6, String ssid, int bandwidth, String login) {
        this.jumlah1 = jumlah1;
        this.kondisi1 = kondisi1;
        this.posisi1 = posisi1;
        this.jumlah2 = jumlah2;
        this.kondisi2 = kondisi2;
        this.posisi2 = posisi2;
        this.jumlah3 = jumlah3;
        this.kondisi3 = kondisi3;
        this.posisi3 = posisi3;
        this.jumlah4 = jumlah4;
        this.kondisi4 = kondisi4;
        this.posisi4 = posisi4;
        this.jumlah5 = jumlah5;
        this.kondisi5 = kondisi5;
        this.posisi5 = posisi5;
        this.jumlah6 = jumlah6;
        this.kondisi6 = kondisi6;
        this.posisi6 = posisi6;
        this.ssid = ssid;
        this.bandwidth = bandwidth;
        this.login = login;
    }

        
        
        
    public int getJumlah1() {
        return jumlah1;
    }

    public void setJumlah1(int jumlah1) {
        this.jumlah1 = jumlah1;
    }

    public String getKondisi1() {
        return kondisi1;
    }

    public void setKondisi1(String kondisi1) {
        this.kondisi1 = kondisi1;
    }

    public String getPosisi1() {
        return posisi1;
    }

    public void setPosisi1(String posisi1) {
        this.posisi1 = posisi1;
    }

    public int getJumlah2() {
        return jumlah2;
    }

    public void setJumlah2(int jumlah2) {
        this.jumlah2 = jumlah2;
    }

    public String getKondisi2() {
        return kondisi2;
    }

    public void setKondisi2(String kondisi2) {
        this.kondisi2 = kondisi2;
    }

    public String getPosisi2() {
        return posisi2;
    }

    public void setPosisi2(String posisi2) {
        this.posisi2 = posisi2;
    }

    public int getJumlah3() {
        return jumlah3;
    }

    public void setJumlah3(int jumlah3) {
        this.jumlah3 = jumlah3;
    }

    public String getKondisi3() {
        return kondisi3;
    }

    public void setKondisi3(String kondisi3) {
        this.kondisi3 = kondisi3;
    }

    public String getPosisi3() {
        return posisi3;
    }

    public void setPosisi3(String posisi3) {
        this.posisi3 = posisi3;
    }

    public int getJumlah4() {
        return jumlah4;
    }

    public void setJumlah4(int jumlah4) {
        this.jumlah4 = jumlah4;
    }

    public String getKondisi4() {
        return kondisi4;
    }

    public void setKondisi4(String kondisi4) {
        this.kondisi4 = kondisi4;
    }

    public String getPosisi4() {
        return posisi4;
    }

    public void setPosisi4(String posisi4) {
        this.posisi4 = posisi4;
    }

    public int getJumlah5() {
        return jumlah5;
    }

    public void setJumlah5(int jumlah5) {
        this.jumlah5 = jumlah5;
    }

    public String getKondisi5() {
        return kondisi5;
    }

    public void setKondisi5(String kondisi5) {
        this.kondisi5 = kondisi5;
    }

    public String getPosisi5() {
        return posisi5;
    }

    public void setPosisi5(String posisi5) {
        this.posisi5 = posisi5;
    }

    public int getJumlah6() {
        return jumlah6;
    }

    public void setJumlah6(int jumlah6) {
        this.jumlah6 = jumlah6;
    }

    public String getKondisi6() {
        return kondisi6;
    }

    public void setKondisi6(String kondisi6) {
        this.kondisi6 = kondisi6;
    }

    public String getPosisi6() {
        return posisi6;
    }

    public void setPosisi6(String posisi6) {
        this.posisi6 = posisi6;
    }

    public String getPosisi6a() {
        return posisi6a;
    }

    public void setPosisi6a(String posisi6a) {
        this.posisi6a = posisi6a;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
        

        
    
    Scanner s=new Scanner(System.in);

    public void input(){
        System.out.println("\tAnalisa Steker");
            System.out.print("Jumlah = ");
            setJumlah1(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi1(s.next());
            System.out.print("Posisi (dekat_dosen/tidak) = ");
            setPosisi1(s.next());
            System.out.println("\tAnalisa Kabel LCD");
            System.out.print("\nJumlah  = ");
            setJumlah2(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi2(s.next());
            System.out.print("Posisi (dekat_dosen/tidak) = ");
            setPosisi2(s.next());
            System.out.println("\n\tAnalisa Lampu");
            System.out.print("Jumlah  = ");
            setJumlah3(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi3(s.next());
            System.out.print("Posisi (atap_ruangan/dimana?) = ");
            setPosisi3(s.next());
            System.out.println("\tAnalisa Kipas Angin");
            System.out.print("Jumlah  = ");
            setJumlah4(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi4(s.next());
            System.out.print("Posisi (atap_ruangan/tidak) = ");
            setPosisi4(s.next());
            System.out.println("\tAnalisa AC");
            System.out.print("Jumlah  = ");
            setJumlah5(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi5(s.next());
            System.out.print("Posisi (dibelakang/disamping) = ");
            setPosisi5(s.next());
            System.out.println("\tAnalisa Internet");
            System.out.print("SSID yang dipakai = ");
            setSsid(s.next());
            System.out.print("Bandwidth (/KBps) = ");
            setBandwidth(s.nextInt());
            System.out.println("Bisa login hotspot?");
            System.out.print("Jawab : ");
            setLogin(s.next());
            System.out.println("\tAnalisa CCTV");
            System.out.print("Jumlah  = ");
            setJumlah6(s.nextInt());
            System.out.print("Kondisi = ");
            setKondisi6(s.next());
            System.out.print("Posisi cctv 1 (depan/belakang) = ");
            setPosisi6(s.next());
            System.out.print("Posisi cctv 2 (depan/belakang) = ");
            setPosisi6a(s.next());
	}
        
       
        public abstract int AnalisaJumlahSteker();
        public abstract String AnalisaKondisiSteker();
        public abstract String AnalisaPosisiSteker();
        public abstract int AnalisaJumlahLcd();
        public abstract String AnalisaKondisiLcd();
        public abstract String AnalisaPosisiLcd();
        public abstract int AnalisaJumlahLampu();
        public abstract String AnalisaKondisiLampu();
        public abstract String AnalisaPosisiLampu();
        public abstract int AnalisaJumlahKipas();
        public abstract String AnalisaKondisiKipas();
        public abstract String AnalisaPosisiKipas();
        public abstract int AnalisaJumlahac();
        public abstract String AnalisaKondisiac();
        public abstract String AnalisaPosisiac();
        public abstract String pilihssid();
        public abstract String AnalisaLogin();
        public abstract int AnalisaJumlahcctv();
        public abstract String AnalisaKondisicctv();
        public abstract String AnalisaPosisicctv1();
        public abstract String AnalisaPosisicctv2();
}
