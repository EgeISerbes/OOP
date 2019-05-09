/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author egese
 */
public class ObsMenu extends UserLogin{
    
    java.util.Scanner scan1 = new java.util.Scanner(System.in);
    private int tercih = 0;
    NoteList note = new NoteList();
    MeanNote mean= new MeanNote();
    
    
    public void ObsMenu()   // Giriş yaptıktan sonra karşımıza çıkacak olan menü
    {
        
    }                     
    public void OnMenu()throws FileNotFoundException, IOException{
        System.out.println("Ne Yapmak İstiyorsunuz ? ");
        while(true) {
        System.out.println("1) Not Listesini Oluştur");
        System.out.println("2) Not Listesine Bak");
        System.out.println("3) Not Listesini Kaydet");
        System.out.println("4) Kullanıcı Bilgilerini Görüntüle");
        System.out.println("5) Çıkış Yap");
        tercih = scan1.nextInt();
        switch(tercih)
           
        {
            case 1 :
                note.createList();
                continue;
            case 2 :
                note.checkList();
                continue;
            case 3 :
                note.saveList();
                continue;
            case 4 :
                ShowUserInfo();
                continue;
            
            case 5 : 
                break;
           
                
        }
        break;
    }
    }
}
