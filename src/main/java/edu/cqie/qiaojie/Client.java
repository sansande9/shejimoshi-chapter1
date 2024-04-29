package edu.cqie.qiaojie;

public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XMlUtil.getBean("image");
        imp = (ImageImp) XMlUtil.getBean("os");
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
