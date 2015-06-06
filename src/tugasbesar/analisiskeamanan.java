/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHO
 */
public class analisiskeamanan {
        String kekokohan(String kokoh){
        if(kokoh.equals("kokoh")){
            return "\tKekokohan sesuai";
        }
        else{
            return"\tKekokohantidak sesuai";        
        }
    }
        
        String kuncipintu(String kpintu){
        if(kpintu.equals("ada")){
            return"\tKunci sesuai";
        }
        else{
            return"\tKunci tidak sesuai";
        }
    }
        String kuncijendela(String kjendela){
        if(kjendela.equals("ada")){
            return"\tsesuai";
        }
        else{
            return"\ttidak sesuai";
        }
    }
        
        String bahaya(String bahaya){
        if(bahaya.equals("aman")){
            return"\tsesuai";
        }
        else{
            return"\ttidak sesuai";
        }
    }

}
