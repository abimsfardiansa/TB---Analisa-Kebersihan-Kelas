/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_kondisi1 extends kondisi_Kelas{
  /*  public analisis_kondisi1(){
        System.out.println("\n\tAnalisa kondisi kelas");
        masuk("Analisa kondisi kelas");
    }
    
    
    @Override
    public int Luas(){
        int luasruang=panjang*lebar;
        System.out.println("\tLuas Kelas = "+luasruang+" meter.");
        if(panjang!=lebar){
            System.out.println("\tRuang kelas sesuai, yaitu persegi panjang.");
          //  return true;
        }
        else{
            System.out.println("\tRuang kelas tidak sesuai, yaitu persegi.");
          //  return false;
        }
        return panjang;
        }
    
    public int rasioluas(){
        int luasrg=panjang*lebar;
        int rasio=luasrg/kursi;
        System.out.print("\tRasio luas = "+rasio);
        if(rasio>=0.5){
            System.out.println(", rasio sesuai.");
          //  return true;
        }
        else{
            System.out.println(", rasio tidak sesuai.");
           // return false;
        }
        return rasio;
        }
    public int jmlpintu(){
        if(pintu>=2){
            System.out.println("\tJumlah pintu "+pintu+", sesuai.");
           // return true;
        }
        else{
            System.out.println("\tJumlah pintu "+pintu+", tidak sesuai.");
          //  return false;
        }
        return pintu;
    }
    
    public int jmljendela(){
        if(jendela>=2){
            System.out.println("\tJumlah jendela "+jendela+", sesuai.");
            System.out.println("------------------------------------------------");
          //  return true;
        }
        else{
            System.out.println("\tJumlah jendela "+jendela+", tidak sesuai.");
            System.out.println("------------------------------------------------");
          //  return false;
        }
        return jendela;
    }*/
    
    
    
    public analisis_kondisi1(int panjang, int lebar, int luas, int kursi, int pintu, int jendela){
        super(panjang, lebar, luas, kursi, pintu, jendela);
        System.out.println("\n\tAnalisa kondisi kelas");
        masuk();
    }

    
    
    @Override
    public int Luas(){
        int luasruang=getPanjang()*getLebar();
        System.out.println("\tLuas Kelas = "+luasruang+" meter.");
        if(getPanjang()!=getLebar()){
            System.out.println("\tRuang kelas sesuai, yaitu persegi panjang.");
          //  return true;
        }
        else{
            System.out.println("\tRuang kelas tidak sesuai, yaitu persegi.");
          //  return false;
        }
        return getPanjang();
        }
    @Override
    public float rasioluas(){
        int luasrg=getPanjang()*getLebar();
        float rasio=luasrg/getKursi();
        System.out.print("\tRasio luas = "+rasio);
        if(rasio>=0.5){
            System.out.println(", rasio sesuai.");
          //  return true;
        }
        else{
            System.out.println(", rasio tidak sesuai.");
           // return false;
        }
        return rasio;
        }
    @Override
    public int jmlpintu(){
        if(getPintu()>=2){
            System.out.println("\tJumlah pintu "+getPintu()+", sesuai.");
           // return true;
        }
        else{
            System.out.println("\tJumlah pintu "+getPintu()+", tidak sesuai.");
          //  return false;
        }
        return getPintu();
    }
    @Override
    public int jmljendela(){
        if(getJendela()>=2){
            System.out.println("\tJumlah jendela "+getJendela()+", sesuai.");
            System.out.println("------------------------------------------------");
          //  return true;
        }
        else{
            System.out.println("\tJumlah jendela "+getJendela()+", tidak sesuai.");
            System.out.println("------------------------------------------------");
          //  return false;
        }
        return getJendela();
    }
    
    public void masukan(){
        System.out.println("panjang "+getPanjang()+", dan lebar "+getLebar());
        System.out.println("jumlah pintu "+getPintu()+", dan jumlah jendela "+getJendela());
    }
}
