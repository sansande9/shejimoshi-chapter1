package edu.cqie.shijian6;

import lombok.Setter;

@Setter
public class ReverseEncryptor219970206 implements Encryptor219970206 {
    /**
     * reverse encryptor
     * @param text
     * @return
     */
    private Encryptor219970206 encryptor219970206;

    @Override
    public String encrypt(String text) {
        return "reverse encryptor";
    }
}
