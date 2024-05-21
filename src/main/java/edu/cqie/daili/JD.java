package edu.cqie.daili;

public class JD extends Mobile {
    private Mobile huaWeiPhone;

    public void setHuaWeiPhone(Mobile huaWeiPhone){
        this.huaWeiPhone = huaWeiPhone;
    }
    //事前方法
    public void adjustPrice(){
        this.huaWeiPhone.setPrice(this.huaWeiPhone.getPrice()*2);
    }
    @Override
    public void show() {
    adjustPrice();
    this.huaWeiPhone.show();
    service();
    }

    public void service(){
        System.out.println("为"+this.huaWeiPhone.getName()+"提供贴膜服务：");
    }
}
