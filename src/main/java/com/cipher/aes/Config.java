/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cipher.aes;

/**
 *
 * @author Mar
 */
public class Config {

    private static Config instance;
    private static String key;

    private Config() {
    }

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public static AES256 load(String key) {
        Config.key = key;
        return new AES256(Config.key);
    }
}
