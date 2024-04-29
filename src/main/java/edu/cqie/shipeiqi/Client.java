package edu.cqie.shipeiqi;

public class Client {
    public static void main(String[] args) {
        //1、找到插座
        ElectricSource source = new ElectricSource();
        //2、找到一个电源适配器
        ComputerAdapter adapter = new ComputerAdapter();
        //3、将适配器和插座链接
        adapter.setElectricSource(source);
        //4、给笔记本充电
        adapter.input();
    }
}
