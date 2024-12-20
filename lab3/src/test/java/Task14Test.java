import org.example.Task14;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task14Test {
    Task14 task14 = new Task14();

    @Test
    public void testEncrypt() {
        String plaintext = "HELLO";
        String key = "ABCa3";
        String expectedCiphertext = "\u0089\u0087\u008F\u00AD\u0082";

        String actualCiphertext = task14.encrypt(plaintext, key);
        assertEquals(expectedCiphertext, actualCiphertext);
    }

    @Test
    public void testDecrypt() {
        String ciphertext = "\u0089\u0087\u008F\u00AD\u0082";
        String key = "ABCa3";
        String expectedPlaintext = "HELLO";

        String actualPlaintext = task14.decrypt(ciphertext, key);
        assertEquals(expectedPlaintext, actualPlaintext);
    }

    @Test
    public void testEncryptAndDecrypt() {
        String plaintext = "HELLO";
        String key = "WRLl3";

        String ciphertext = task14.encrypt(plaintext, key);
        String decryptedText = task14.decrypt(ciphertext, key);

        assertEquals(plaintext, decryptedText);
    }
}
