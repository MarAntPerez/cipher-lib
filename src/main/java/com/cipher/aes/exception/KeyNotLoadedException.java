/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cipher.aes.exception;

/**
 *
 * @author Mar
 */
public class KeyNotLoadedException extends Exception {
        
    public KeyNotLoadedException(){
        super("No existe instancia inicializada");
    }
    
}
