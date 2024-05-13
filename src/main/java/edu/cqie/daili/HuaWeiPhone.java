package edu.cqie.daili;

public class HuaWeiPhone extends Mobile{
    public HuaWeiPhone(){
        this.setName("华为P70art");
        this.setPrice(800000000);
    }

    // 华为手机
    @Override
    public void show() {
        System.out.println("中国制造的华为手机，型号："+this.getName()+"价格："+this.getPrice());
    }
}
