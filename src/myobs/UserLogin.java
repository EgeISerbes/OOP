/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;

import java.util.Scanner;

/**
 *
 * @author egese
 */
public class UserLogin extends UserRegister { // Giriş Yapmak için bu sınıfı kullanacağız

    protected String UserCheck; // Kullanıcı adı ile karşılaştırmak için
    protected String PassCheck; // Şifre ile karşılaştırmak için

    public void UserLogin() {

    }

    public  void Login() throws NullPointerException {
       
        
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your Username : ");
            UserCheck = scan.nextLine();
            System.out.println("Enter your Password : ");
            PassCheck = scan.nextLine();     

            for (int i = 0; i < 5; i++) {
                if ((UserCheck.equals(Username[i][0])) && (PassCheck.equals(Password[i][0])) ) { // Şifre ve kullanıcı adı  
                                                                                                 // aynı mı kontrol etmek için
                    System.out.println("Başarıyla Giriş Yapıldı !");
                    tempID = i + 1;                             // Kaçıncı kişi olarak giriş yapmılmışsa tempID ye atanır
                    break;
                } else {
                    if (i == ID - 1) { // Eğer son döngüde de koşul sağlanmamışsa  demek ki yanlış bir giriş olmuşur
                            System.out.println("Hatalı kullanıcı adı veya şifre girildi ! Tekrar deneyiniz.");
                            Login(); // Fonksiyonu tekrar çağırıyoruz
                    }

                }
            }
            
        

    }
    public void ShowUserInfo() // Kullanıcı Bilgilerini Göstermek için
    {
        System.out.println(Name[tempID-1][0] + "   ID : "+Name[tempID-1][1]); 
        System.out.println(Surname[tempID-1][0]);
        System.out.println(SchoolID[tempID-1][0]);
        
    }

}
