package edu.cqie.methodfactory.concreteproduct;

import edu.cqie.methodfactory.product.Mobile;

public class Iphone extends Mobile {
    public Iphone(){
        this.name = "Iphone14";
        this.price = 300;
    }
    public String source(){
        return "重庆溪水";
    }

}
