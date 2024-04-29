package edu.cqie.singleton;

public class Customer {


    public void getNumber(){
        int number = Machine.getInstance().sendNumber();
        System.out.println("顾客取到"+number);
    }
}
