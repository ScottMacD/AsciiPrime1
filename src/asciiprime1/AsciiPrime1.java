/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Scott MacDonald
//ScottMacD82@gmail.com
//206-418-9400
package asciiprime1;

import java.math.BigInteger;
import java.util.Scanner;

public class AsciiPrime1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Creates the input 
        Scanner user_input = new Scanner (System.in);
        
        //Sets up BigInteger values for Remainder Math later.
        BigInteger bigInt0 = new BigInteger("0");
        BigInteger bigInt1 = new BigInteger("2");
        BigInteger bigInt2 = new BigInteger("3");
        BigInteger bigInt3 = new BigInteger("5");
        
        //Creates Strings
         
        String favoriteFlick;
        String lowerFlick;
        
        //String input
        System.out.println("Enter the title of your favorite film?");
        favoriteFlick = user_input.nextLine();
        
        //Sets string input to lowercase
        lowerFlick = favoriteFlick.toLowerCase();
        System.out.println(lowerFlick);
        
        //Creates new Stringbuilder.
        StringBuilder movieString = new StringBuilder();
        
         //Loop goes through string, and converts each letter value to ascii
            for (char c : lowerFlick.toCharArray())
            movieString.append((int)c);

            //Takes the value from the loop, and puts it into new string.
               BigInteger movieInt = new BigInteger(movieString.toString());
               
           //Remainder of the BigInteger value of the string by 2, 3, 5 to determine if prime.
           if (movieInt.remainder(bigInt1).equals(bigInt0) || movieInt.remainder(bigInt2).equals(bigInt0) || movieInt.remainder(bigInt3).equals(bigInt0)){
               //prints value based on prime status
               System.out.println(movieInt);
                       } else {
               System.out.println(movieInt + " is a prime number");
           }
            
           //Creates Strings    
        String favoriteMusic;
        String lowerMusic;
        
        //String input
        System.out.println("Enter the name of your favorite musical act?");
        favoriteMusic = user_input.nextLine();
        
         //Sets string input to lowercase
        lowerMusic = favoriteMusic.toLowerCase();
        System.out.println(lowerMusic);
        
        //Creates new Stringbuilder.
        StringBuilder musicString = new StringBuilder();
        
          //Loop goes through string, and converts each letter value to ascii
            for (char c : lowerMusic.toCharArray())
            musicString.append((int)c);

            //Takes the value from the loop, and puts it into new string.
             BigInteger musicInt = new BigInteger(musicString.toString());
               
          //Remainder of the BigInteger value of the string by 2, 3, 5 to determine if prime.
           if (musicInt.remainder(bigInt1).equals(bigInt0)  || musicInt.remainder(bigInt2).equals(bigInt0) || musicInt.remainder(bigInt3).equals(bigInt0)){
               //prints value based on prime status
               System.out.println(musicInt);
                   } else {
               System.out.println(musicInt + " is a prime number");
            }
           
           //Creates Strings 
        String favoriteAuthor;
        String lowerAuthor;
        
        //String input
        System.out.println("Enter the name of your favorite Author");
        favoriteAuthor = user_input.nextLine();
        
        //Sets string input to lowercase
        lowerAuthor = favoriteAuthor.toLowerCase();
        System.out.println(lowerAuthor);
        
        //Creates new Stringbuilder.
        StringBuilder authorString = new StringBuilder();
        
          //Converts String to Ascii
            for (char c : lowerAuthor.toCharArray())
            authorString.append((int)c);
             
            //Takes the value from the loop, and puts it into new string.
             BigInteger authorInt = new BigInteger(authorString.toString());
               
          //Remainder of the BigInteger value of the string by 2, 3, 5 to determine if prime.
           if (authorInt.remainder(bigInt1).equals(bigInt0)  || authorInt.remainder(bigInt2).equals(bigInt0) || authorInt.remainder(bigInt3).equals(bigInt0)){
               
               //prints value based on prime status
               System.out.println(authorInt);
                   } else {
               System.out.println(authorInt + " is a prime number");
            }
           
           //Creates Strings 
        String favoriteArtist;
        String lowerArtist;
        
         //String input
        System.out.println("Enter the name of your favorite Artist");
        favoriteArtist = user_input.nextLine();
        
        //Sets string input to lowercase
        lowerArtist = favoriteArtist.toLowerCase();
        System.out.println(lowerArtist);
        
        //Creates new Stringbuilder.
        StringBuilder artistString = new StringBuilder();
        
          //Converts String to Ascii
            for (char c : lowerArtist.toCharArray())
            artistString.append((int)c);
           
             //Takes the value from the loop, and puts it into new string.
             BigInteger artistInt = new BigInteger(artistString.toString());
               
            //Remainder of the BigInteger value of the string by 2, 3, 5 to determine if prime.
           if (artistInt.remainder(bigInt1).equals(bigInt0)  || artistInt.remainder(bigInt2).equals(bigInt0) || artistInt.remainder(bigInt3).equals(bigInt0)){
               //prints value based on prime status
               System.out.println(artistInt);
                   } else {
               System.out.println(artistInt + " is a prime number");
            }
         
           //Creates Strings 
        String ohBTW;
        String lowerOh;
        
         //String input
        System.out.println("Oh, by the way, what is your name?");
        ohBTW = user_input.nextLine();
        
        //Sets string input to lowercase
        lowerOh = ohBTW.toLowerCase();
        System.out.println(lowerOh);
        
        //Creates new Stringbuilder.
        StringBuilder ohString = new StringBuilder();
        
          //Converts String to Ascii
            for (char c : lowerOh.toCharArray())
            ohString.append((int)c);
             
            //Takes the value from the loop, and puts it into new string.
             BigInteger ohInt = new BigInteger(ohString.toString());
               
          //Remainder of the BigInteger value of the string by 2, 3, 5 to determine if prime.
           if (ohInt.remainder(bigInt1).equals(bigInt0)  || ohInt.remainder(bigInt2).equals(bigInt0) || ohInt.remainder(bigInt3).equals(bigInt0)){
               
               //prints value based on prime status
               System.out.println(ohInt);
                   } else {
               System.out.println(ohInt + " is a prime number");
            }
    }
}

    
    
           
           
  
    
    
            
        
        
       
            
        

      