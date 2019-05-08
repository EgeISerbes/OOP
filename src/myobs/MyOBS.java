/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.ws.BindingProvider;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 *
 * @author egese
 */
public class MyOBS extends UserLogin {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        int tercih ;
        char tercih1 ;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        ObsMenu menu = new ObsMenu();
        System.out.println("Öğrenci Bilgi Sistemi'ne Hoşgeldiniz !");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        while(true){
        System.out.println("1) Kayıt Ol");
        System.out.println("2) Giriş Yap");
        System.out.println("3) Çıkış Yap");
        tercih = scan.nextInt() ;
        switch(tercih)
        {
            case 1 :
              menu.Register();
                continue;
            case 2 :
                menu.Login();
                menu.OnMenu();
                
                continue;
            case 3 :
                System.out.println("Exiting ... ");
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
                finally{
                    break ;
                }
                
                    
                
        }
           break ;
        
    }
    }

}
