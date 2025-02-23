package net.renfei.sdk.test.utils;

import lombok.SneakyThrows;
import net.renfei.sdk.test.Tests;
import net.renfei.sdk.utils.EncryptionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author RenFei
 */
public class EncryptionUtilsTest extends Tests {
    @Test
    public void testEncryptionUtils() throws InterruptedException {
        Runnable taskTemp = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println("==== " + this.getClass().getName() + " ====");
                System.out.println(EncryptionUtils.encrypt("SHA1", "Test"));
                System.out.println(EncryptionUtils.encrypt("MD5", "Test"));
                Assertions.assertNull(EncryptionUtils.encrypt(null, null));
                Assertions.assertNull(EncryptionUtils.encrypt("Test", "Test"));
            }
        };
        startTaskAllInOnce(100, taskTemp);
    }
}
