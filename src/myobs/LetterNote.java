/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;

/**
 *
 * @author egese
 */
public class LetterNote extends UserLogin{
   
    double[] Letters = new double[5]; // Harf Notu için
    double[] Kredi = new double[]{6.0,5.0,6.0,6.0,2.0}; // Her bir ders için verilmiş krediler
    String Harf ;
    public void LetterNote()
    {
        
    }
    protected String FindLetterNote(int[][][] x,int i) // Notların Harf ve Harf notu karşılığını tespit etmek için kullanılır
    {   
        LetterNote y  = new LetterNote();
        int toplam = 0;
        toplam+= x[i][0][tempID -1]*0.4 +x[i][1][tempID -1]*0.6; // Vize %40 , Final %60 şeklinde
        if(toplam<=100 && toplam>=90)
        {
            Letters[i]= 4.0 ;
            
            Harf = "AA";
        }
        else if(toplam<=89 && toplam >=80)
        {
            Letters[i] = 3.5;
            Harf= "BA" ;
        }
        else if(toplam<=79 && toplam>=75) {
            Letters[i] =3.0;
            Harf = "BB";
        }
        else if(toplam<=74 && toplam>=70){
            Letters[i] =2.5;
            Harf = "CB";
        }
        else if(toplam<=69 && toplam>=65){
            Letters[i] =2.0;
            Harf = "CC";
        }
        else if(toplam<=64 && toplam>=60){
            Letters[i] =1.5;
            Harf = "DC";
        }
        else if(toplam<=59 && toplam>=55){
            Letters[i] =1.0;
            Harf = "DD";
        }
        else if(toplam<=54 && toplam>=35){
            Letters[i] =0.5;
            Harf = "FD";
        }
        else if(toplam<=34 && toplam>=0){
            Letters[i] = 0.0;
            Harf = "FF";
        }
            
        return Harf ;
    }

    
}
