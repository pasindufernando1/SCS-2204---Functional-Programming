//Question 1 => Ceasar Cipher

import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Q1 extends App{

    //Declaring the alphabet
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    //Encryption function
    val encryption = (character:Char,shift:Int,alphabet:String) => alphabet((alphabet.indexOf(character.toUpper)+shift)%alphabet.size)

    //Decryption function
    val decryption = (character:Char,shift:Int,alphabet:String) => {
        if((alphabet.indexOf(character.toUpper)-shift)>=0){
            alphabet((alphabet.indexOf(character.toUpper)-shift)%alphabet.size)
        }else{
            alphabet((alphabet.indexOf(character.toUpper)-shift)+alphabet.size)
        }
        
    }
    //Cipher function
    val cipher = (func:(Char,Int,String)=>Char,input:String,shift:Int,alphabet:String) => input.map(func(_,shift,alphabet));

    //Getting the users input for the strings and the shift value
    printf("Enter the string to be encrypted : ")
    val inputToEncrypt = readLine()
    printf("Enter the string to be decrypted : ")
    val inputToDecrypt = readLine()
    printf("Enter the no. of characters to be shifted : ");
    val shift = readInt()

    //Outputting the processed results inputted by the user
    printf("The encrypted version of %s is %s\n",inputToEncrypt,cipher(encryption,inputToEncrypt,shift,alphabet));
    printf("The decrypted version of %s is %s\n",inputToDecrypt,cipher(decryption,inputToDecrypt,shift,alphabet));

}