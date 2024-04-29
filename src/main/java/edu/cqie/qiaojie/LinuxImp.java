package edu.cqie.qiaojie;

public class LinuxImp implements ImageImp{

    @Override
    public void doPaint(MAtrix m) {
        System.out.println("在Linux操作系统上显示图像");
    }
}
