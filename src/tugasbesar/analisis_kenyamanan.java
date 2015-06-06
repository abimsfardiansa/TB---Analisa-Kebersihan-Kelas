
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class analisis_kenyamanan extends kenyamanan_kelas{
        Scanner a=new Scanner(System.in);
    public analisis_kenyamanan(String bising, String bau, String bocor, String rusak, String aus){
        super(bising,bau,bocor,rusak,aus);
    }
    analisiskenyamanan as=new analisiskenyamanan();
    

    @Override
    public void masuk(){
        try{
        
        super.saya();
       // as.analisisnyaman(bising, bau, bocor, rusak, aus);
            System.out.println(as.analisisnyaman(bising));
           // String =as.analisisnyaman(bising);
            System.out.println(as.analisisbau(bau));
           // String bauk=as.analisisbau(bau);
            System.out.println(as.analisisbocor(bocor));
            System.out.println(as.analisisrusak(rusak));
            System.out.println(as.analisisaus(aus));
        
        String path = "D:/kenyamanan.txt";
            boolean append = true;//jika append = false file lama dihapus, jika true melanjutkan file yang ada
 
            TextHandle file = new TextHandle(path,append); 
               
               
//            System.out.print("Masukan Kata :");
            file.writeFile(bising+" : "+as.analisisnyaman(bising));
            file.writeFile(bau+" : "+as.analisisbau(bau));
            file.writeFile(bocor+" : "+as.analisisbocor(bocor));
            file.writeFile(rusak+" : "+as.analisisrusak(rusak));
            file.writeFile(aus+" : "+as.analisisaus(aus));
           // file.writeFile(bisingg);
           
          /*  System.out.println("Hasil Input Ruang :");
            
            String [] aryLines = file.openFile();
            int i;
            for ( i=0; i < aryLines.length; i++ ) {
                System.out.println( aryLines[ i ] ) ;
            }*/
        } catch (IOException ex) {
            //Logger.getLogger(Input_IdentitasRK.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }

   
    
    
    /*@Override
    String analisisnyaman(){
        if(getBising().equals("tidak.bising")){
            return "\tHening, sesuai.";
            //return "\tHening, sesuai.";
        }
        else{
            return"\tBising, tidak sesuai.";
            //return "\tBising, tidak sesuai.";
        }
        //return getBising();
    }
    @Override
    public String analisisbau(){
         if(getBau().equals("tidak.bau")){
            System.out.println("\tHarum, sesuai.");
            // return "\tHarum, sesuai.";
        }
        else{
            System.out.println("\tBau, tidak sesuai.");
            // return "\tBau, tidak sesuai.";
        }
         return getBau();
    }
    @Override
    public String analisisbocor(){
        if(getBocor().equals("tidak.bocor")){
            System.out.println("\tTidak bocor, sesuai.");
            //return "\tTidak bocor, sesuai.";
        }
        else{
            System.out.println("\tBocor, tidak sesuai.");
            //return "\tBocor, tidak sesuai.";
        }
        return getBocor();
    }
    @Override
    public String analisisrusak(){
        if(getRusak().equals("tidak.rusak")){
            System.out.println("\tUtuh, sesuai.");
            //return "\tUtuh, sesuai.";
        }
        else{
            System.out.println("\tRusak, tidak sesuai.");
            //return "\tRusak, tidak sesuai.";
        }
        return getRusak();
    }
    @Override
        public String analisisaus(){
        if(getAus().equals("tidak.aus")){
            System.out.println("\tUtuh, sesuai.");
            //return "\tUtuh, sesuai.";
           // return "------------------------------------------------";
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("\tAus, tidak sesuai.");
            //return "Aus, tidak sesuai";
            
            System.out.println("------------------------------------------------");
        }
        return getAus();
    }
       
        @Override
        public void njobo(){
            System.out.println("Kebisingan = "+getBising());
            System.out.println("Bau ruangan = "+getBau());
            System.out.println("Kebocoran = "+getBocor());
            System.out.println("Kerusakan = "+getRusak());
            System.out.println("Keausan = "+getAus());
        }
    }*/
    
}

