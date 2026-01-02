/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cipher.aes;

import com.cipher.aes.exception.KeyNotLoadedException;

/**
 *
 * @author Mar
 */
public class Config {

    private static Config instance;
    private static String key;
    private static AES256 aesInstance;

    private Config() {
    }

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public static synchronized AES256 load(String key) throws KeyNotLoadedException {
        if(aesInstance == null){
            if(key == null || key.isBlank()){
                throw new KeyNotLoadedException();
            }
            Config.key = key;
            aesInstance = new AES256(Config.key);
        }
        return aesInstance;
    }
}
