/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cipher.aes;

import com.cipher.aes.exception.KeyNotLoadedException;

/**
 *
 * @author Mar
 */
public class CryptoLib {

    public static void main(String[] args) throws KeyNotLoadedException {
        AES256 aes = Config.load("clave-ultra-secreta-para-aes-256");
        
        String text = "Mensaje secreto";
        String encryptedText = aes.crypt(text);
        String decryptedText = aes.decrypt(encryptedText);
        
        System.out.println(encryptedText);
        System.out.println(decryptedText);
    }
}
