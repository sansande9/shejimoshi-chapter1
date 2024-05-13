package edu.cqie.daili;

public class Client  {
    public static void main(String[] args) {
        Mobile huawei = new HuaWeiPhone();
        JD jdhuawei = new JD();
        jdhuawei.setHuaWeiPhone(huawei);
        jdhuawei.show();
    }

}
