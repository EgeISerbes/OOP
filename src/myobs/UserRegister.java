/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobs;
import java.util.Scanner ;
/**
 *
 * @author egese
 */
public class UserRegister { // Program ilk çalıştırıldığında kayıt bilgilerini almak için
   protected static int ID = 1 ; // Birden fazla kayıt yapıldığında giriş yapan kişinin kim olduğunu bulmak için
   protected static int tempID ; // O anki giriş yapan kişinin Id 'sini tutmak için
   protected  String[][] Name = new String[5][2];
   protected  String[][] Surname = new String[5][2];
   protected  String[][] SchoolID = new String[5][2];
   protected  String[][] Username = new String[5][2]; 
   protected  String[][] Password = new String[5][2]; 
   protected  String[][] Department = new String[5][2];  
   
   
   public void UserRegister() //Constructor
   {
       
   }
   public void Register()
   {   
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your name :");
       Name[ID-1][0] = input.nextLine();
       Name[ID-1][1]= Integer.toString(ID);
       System.out.println("Enter your last name :");
       Surname[ID-1][0] = input.nextLine();
       Surname[ID-1][1] = Integer.toString(ID);
       System.out.println("Enter your School ID :");
       SchoolID[ID-1][0] = input.nextLine();
       SchoolID[ID-1][1] = Integer.toString(ID);
       System.out.print("Enter your Department : ");
       Department[ID-1][0]= input.nextLine();
       Department[ID-1][1]=Integer.toString(ID);
       System.out.print("Enter a username : ");
       Username[ID-1][0] = input.nextLine();
       Username[ID-1][1]= Integer.toString(ID);
       System.out.print("\nEnter a Password : ");
       Password[ID-1][0]= input.nextLine();
       Password[ID-1][1]= Integer.toString(ID);
       
       
       ID ++;
      
   }
}
