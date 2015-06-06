/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class Analisissaranaprasarana {
     
    public int AnalisaJumlahSteker(int jumlah1){
        if(jumlah1>=4){
            System.out.println("\tJumlah steker Sesuai.");
        }
        else{
            System.out.println("\tJumlah Steker Tidak sesuai.");
        }
        return jumlah1;
    }
    
    public String AnalisaKondisiSteker(String kondisi1, int jumlah1){
        if(kondisi1.equals("baik") && jumlah1>=4){
            return"\tKondisi steker Sesuai.";
        }
        else{
            return"\tKondisi steker Tidak sesuai.";
            
        }
    }
    
    public String AnalisaPosisiSteker(String posisi1){
        if(posisi1.equals("dekat_dosen")){
            return "\tPosisi steker Sesuai.";
        }
        else{
            return "\tPosisi steker Tidak sesuai.";
        }
    }
    
    
    
    public int AnalisaJumlahLcd(int jumlah2){
        if(jumlah2>=1){
            System.out.println("\tJumlah kabel LCD Sesuai.");
         //  return true;
        }
        else{
            System.out.println("\tJumlah kabel LCD Tidak sesuai.");
          // return false;
        }
        return jumlah2;
    }
    
    public String AnalisaKondisiLcd(String kondisi2){
        if(kondisi2.equals("baik")){
            return "\tKondisi Kabel LCD Sesuai.";
        }
        else{
            return "\tKondisi kabel LCD Tidak sesuai.";
        }
        
    }
    
    public String AnalisaPosisiLcd(String posisi2){
        if(posisi2.equals("dekat_dosen")){
            return "\tPosisi kabel LCD Sesuai.";
        }
        else{
            return"\tPosisi kabel LCD Tidak sesuai.";
        }
        
    }
    
    
    public int AnalisaJumlahLampu(){
        if(getJumlah3()>=18){
            System.out.println("\tJumlah lampu Sesuai");
           //return true;
        }
        else{
            System.out.println("\tJumlah lampu Tidak sesuai");
          // return false;
        }
        return getJumlah3();
    }
    
    public String AnalisaKondisiLampu(){
        if(getKondisi3().equals("baik")&& getJumlah3()>=18){
            System.out.println("\tKondisi lampu Sesuai");
        }
        else{
            System.out.println("\tKondisi lampu Tidak sesuai");
        }
        return getKondisi3();
    }
    
    public String AnalisaPosisiLampu(){
        if(getPosisi3().equals("atap_ruangan")){
            System.out.println("\tPosisi lampu Sesuai");
        }
        else{
            System.out.println("\tPosisi lampu Tidak sesuai");
        }
        return getPosisi3();
    }   

    
    
    public int AnalisaJumlahKipas(){
        if(getJumlah4()>=2){
            System.out.println("\tJumlah kipas Sesuai.");
        //   return true;
        }
        else{
            System.out.println("\tJumlah kipas Tidak sesuai.");
       //    return false;
        }
        return getJumlah4();
    }
    
    public String AnalisaKondisiKipas(){
        if(getKondisi4().equals("baik")&& getJumlah4()==2){
            System.out.println("\tKondisi kipas Sesuai.");
        }
        else{
            System.out.println("\tKondisi kipas Tidak sesuai.");
        }
        return getPosisi4();
    }
    
    public String AnalisaPosisiKipas(){
        if(getPosisi4().equals("atap_ruangan")){
            System.out.println("\tPosisi kipas Sesuai.");
        }
        else{
            System.out.println("\tPosisi kipas Tidak sesuai.");
        }
        return getPosisi4();
    }   
    
    
    
    public int AnalisaJumlahac(){
        if(getJumlah5()>=1){
            System.out.println("\tJumlah AC Sesuai.");
          // return true;
        }
        else{
            System.out.println("\tJumlah AC Tidak sesuai.");
          // return false;
        }
        return getJumlah5();
    }
     
    public String AnalisaKondisiac(){
        if(getKondisi5().equals("baik")){
            System.out.println("\tKondisi AC Sesuai.");
        }
        else{
            System.out.println("\tKondisi AC Tidak sesuai.");
        }
        return getKondisi5();
    }
     
    public String AnalisaPosisiac(){
        if(getPosisi5().equals("disamping") || getPosisi5().equals("dibelakang")){
            System.out.println("\tPosisi AC Sesuai.");
        }
        else{
            System.out.println("\tPosisi AC Tidak sesuai.");
        }
        return getPosisi5();
    }   
     
     
     
    public String pilihssid(){
        if(getSsid().equals("UMMHotspot") || getSsid().equals("ummhotspot") || getSsid().equals("UMMHOTSPOT")){
            System.out.println("\tSSID Sesuai.");
            System.out.println("bandwidth "+getBandwidth());
        }
        else{
            System.out.println("\tSSID Tidak sesuai.");
        }
        return getSsid();
    }
    
    public String AnalisaLogin(){
        if(getLogin().equals("bisa")){
            System.out.println("\tHotspot sesuai.");
        }
        else{
            System.out.println("\tHotspot Tidak sesuai.");
        }
        return getLogin();
    }   
     
    
     
    public int AnalisaJumlahcctv(){
        if(getJumlah6()>=2){
            System.out.println("\tJumlah CCTV Sesuai.");
          // return true;
        }
        else{
            System.out.println("\tJumlah CCTV Tidak sesuai.");
           //return false;
        }
        return getJumlah6();
    }
    
    public String AnalisaKondisicctv(){
        if(getKondisi6().equals("baik") && getJumlah6()>=2){
            System.out.println("\tKondisi CCTV Sesuai.");
        }
        else{
            System.out.println("\tKondisi CCTV Tidak sesuai.");
        }
        return getKondisi6();
    }
    
    public String AnalisaPosisicctv1(){
        if(getPosisi6().equals("depan")){
            System.out.println("\tPosisi CCTV 1 Sesuai.");
        }
        else{
            System.out.println("\tPosisi CCTV 1 Tidak sesuai.");
        }
        return getPosisi6();
    }
    
    public String AnalisaPosisicctv2(){
        if(getPosisi6a().equals("belakang")){
            System.out.println("\tPosisi CCTV 2 Sesuai.");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tPosisi CCTV 2 Tidak sesuai.");
            System.out.println("------------------------------------------------");
        }
        return getPosisi6a();
    }
}
