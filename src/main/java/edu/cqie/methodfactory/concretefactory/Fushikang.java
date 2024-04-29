package edu.cqie.methodfactory.concretefactory;

import edu.cqie.methodfactory.concreteproduct.Iphone;
import edu.cqie.methodfactory.factory.MobileFactory;
import edu.cqie.methodfactory.product.Mobile;

public class Fushikang implements MobileFactory {
    public Mobile createMobile(){
        Mobile mobile = new Iphone();
        return mobile;
    }
}
