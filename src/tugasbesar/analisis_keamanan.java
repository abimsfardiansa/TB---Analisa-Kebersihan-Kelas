
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisis_keamanan extends kemananan_kelas{
  Scanner m=new Scanner(System.in);
  public analisis_keamanan(String kokoh, String kpintu, String kjendela, String bahaya){
      super(kokoh,kpintu, kjendela, bahaya);
  }
    analisiskeamanan x=new analisiskeamanan();
  @Override
  public void aman(){
      try{
      super.amana();
      System.out.println(x.kekokohan(kokoh));
      System.out.println(x.kuncipintu(kpintu));
      System.out.println(x.kuncijendela(kjendela));
      System.out.println(x.bahaya(bahaya));
      
       String path = "D:/keamanan.txt";
            boolean append = true;//jika append = false file lama dihapus, jika true melanjutkan file yang ada
 
            TextHandle file = new TextHandle(path,append); 
            
            file.writeFile(x.kekokohan(kokoh));
            file.writeFile(x.kuncipintu(kpintu));
            file.writeFile(x.kuncijendela(kjendela));
            file.writeFile(x.bahaya(bahaya));
            
            /*  System.out.println("Hasil Input Ruang :");
            
            String [] aryLines = file.openFile();
            int i;
            for ( i=0; i < aryLines.length; i++ ) {
                System.out.println( aryLines[ i ] ) ;
            }*/
        } catch (IOException ex) {
            ex.printStackTrace();
            //Logger.getLogger(Input_IdentitasRK.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
  }
  
  
        
    

