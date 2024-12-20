package org.example;

public class Task14 {

    public String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char textChar = plaintext.charAt(i);
            char keyChar = key.charAt(i);
            char encryptedChar = (char) (textChar + keyChar);
            ciphertext.append(encryptedChar);
        }
        return ciphertext.toString();
    }

    public String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            char keyChar = key.charAt(i);
            char decryptedChar = (char) (cipherChar - keyChar);
            plaintext.append(decryptedChar);
        }
        return plaintext.toString();
    }
}
