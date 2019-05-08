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
public class MeanNote extends LetterNote{
    
    public double  ShowMeanNote()
    {   
        LetterNote let = new LetterNote();
        double toplam = 0;
        for (int i = 0; i < 5; i++) {
            toplam+= Letters[i] * Kredi[i];
        }
        return toplam /25;
    }
    
}
