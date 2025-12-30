/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cipher.aes;

/**
 *
 * @author Mar
 */
public class CryptoLib {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AES256 aes = Config.getInstance().load("clave-ultra-secreta-para-aes-256");
        
        String text = "Mensaje secreto";
        String encryptedText = aes.crypt(text);
        String decryptedText = aes.decrypt(encryptedText);
        
        System.out.println(encryptedText);
        System.out.println(decryptedText);
    }
}
