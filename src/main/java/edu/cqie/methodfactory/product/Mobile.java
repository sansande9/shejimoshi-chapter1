package edu.cqie.methodfactory.product;

public abstract class Mobile {
    public String name;
    public int price;
    public abstract String  source();
    public void show(){
        System.out.println(this.name+"手机，产地是"+this.source()+"，价格为"+this.price+"元");
    }
}
