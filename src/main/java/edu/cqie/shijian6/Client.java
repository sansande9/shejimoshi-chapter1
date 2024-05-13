package edu.cqie.shijian6;

public class Client {
    public static void main(String[] args) {
        Encryptor219970206 simple = new SimpleShiftEncryptor219970206();
        Encryptor219970206 reverse = new ReverseEncryptor219970206();
        Encryptor219970206 modulo = new ModuloEncryptor219970206();

        String plainText = "abcdefghijklmnopqrstuvwxyz";
        String encrypt = simple.encrypt(plainText);
        String encrypt3 = simple.encrypt(encrypt);
        String encrypt1 = reverse.encrypt(plainText);
        String encrypt2 = modulo.encrypt(plainText);
        //一次加密
        System.out.println(encrypt);
        //二次加密
        System.out.println(encrypt3);
        //逆
        System.out.println(encrypt1);
        //模
        System.out.println(encrypt2);
    }


}
