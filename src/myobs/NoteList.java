/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author egese
 */
public class NoteList extends UserLogin  { // Not Listesi için
    
    protected String[] Dersler = new String[]{"Nesneye Yönelik Programlama","Elektrik Devre Temelleri","Matematik","Fizik","İngilizce"};
    protected int[][][] Notlar = new int[5][2][5];
    java.util.Scanner scan = new java.util.Scanner(System.in);
    
    MeanNote meanv = new MeanNote();
   
   
    
    
    public void NoteList()
    {
        
    }
    public void createList() // Girilen kullanıcının not listesini oluşturmak için
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(Dersler[i] + ":");
            
                System.out.println("Vize : ");
                Notlar[i][0][tempID-1] = scan.nextInt();
                System.out.println("Final : ");
                Notlar[i][1][tempID-1] = scan.nextInt();
                meanv.FindLetterNote(Notlar, i) ;
           
            
  
        }
        
    }
    public void checkList() // Not listesini göstermek için
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(Dersler[i] + ":");
            
                System.out.print("Vize : " + Notlar[i][0][tempID-1]);
                 
                System.out.print("    Final : " + Notlar[i][1][tempID-1]);
                
                System.out.println("    Harf : "+ meanv.FindLetterNote(Notlar, i));
                 
                
            
            
  
        }
        System.out.println("GANO : "+meanv.ShowMeanNote());
    }
    public void saveList() throws FileNotFoundException, IOException // Not listesini dosyaya kaydetmek için
    {
         File file = new File("C:\\Users\\egese\\Desktop\\test.txt") ;
        PrintWriter output = new PrintWriter(file);
      
         for (int i = 0; i < 5; i++) {
            output.println(Dersler[i] + ":");
            
                output.println("Vize : " + Notlar[i][0][tempID-1]);
                 
                output.println("Final : " + Notlar[i][1][tempID-1]);
                 
                
            
            
  
        }
         output.println("GANO : "+meanv.ShowMeanNote());
         output.close();
        
    }
    
}
